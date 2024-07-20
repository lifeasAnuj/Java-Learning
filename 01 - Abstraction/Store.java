package com.Anuj;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    public static void main(String[] args) {
        ArrayList<ProductForSale> saleItems = new ArrayList<>();
        saleItems.add(new Television("Sony OLED", 45532.36, "MBX22131", true, 7));
        saleItems.add(new Television("Acer OLED", 7897.36, "MBX22131", true, 7));
        saleItems.add(new Product("JBL BassHeads", 8795.15, "Loud, Long-Battery, Good Bass", "Speaker", 5));

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("""
                        Press...
                        0 - Customer
                        1 - Admin
                        9 - Quit
                        Enter a Number : 
                    """);
            int x = Integer.parseInt(input.next());
            if (x == 9) {
                break;
            }

            switch (x) {
                case 0: // Customer
                    handleCustomer(saleItems, input);
                    break;

                case 1: // Admin
                    handleAdmin(saleItems, input);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        input.close();
    }

    private static void handleCustomer(ArrayList<ProductForSale> saleItems, Scanner input) {
        ArrayList<ProductForSale> cart = new ArrayList<>();
        while (true) {
            System.out.println("Products For Sale...\n");
            printProperly(saleItems);
            System.out.print("Enter PRODUCT ID to add to cart or 'done' to finish: ");
            String buyProductID = input.next();

            if (buyProductID.equalsIgnoreCase("done")) {
                break;
            }

            boolean found = false;
            for (ProductForSale e : saleItems) {
                if (e.productID.equals(buyProductID)) {
                    if (e.count > 0) {
                        e.count--; // Decrease stock
                        cart.add(e); // Add to cart
                        System.out.println("Product added to cart. Remaining count: " + e.count);
                    } else {
                        System.out.println("Product out of stock.");
                    }
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Product ID not found.");
            }
        }

        generateBill(cart);
    }

    private static void handleAdmin(ArrayList<ProductForSale> saleItems, Scanner input) {
        System.out.println("Admin Options:");
        System.out.println("1 - Add Product");
        System.out.println("2 - Remove Product");
        System.out.print("Enter choice: ");
        int choice = Integer.parseInt(input.next());

        switch (choice) {
            case 1:
                addProduct(saleItems, input);
                break;

            case 2:
                removeProduct(saleItems, input);
                break;

            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }

    private static void addProduct(ArrayList<ProductForSale> saleItems, Scanner input) {
        System.out.println("Enter product type (Television/Product): ");
        String type = input.next();
        System.out.print("Enter product name: ");
        String name = input.next();
        System.out.print("Enter product price: ");
        double price = Double.parseDouble(input.next());
        System.out.print("Enter product count: ");
        int count = Integer.parseInt(input.next());

        if (type.equalsIgnoreCase("Television")) {
            System.out.print("Enter model: ");
            String model = input.next();
            System.out.print("Enter HDR (true/false): ");
            boolean isHdr = Boolean.parseBoolean(input.next());
            saleItems.add(new Television(name, price, model, isHdr, count));
        } else if (type.equalsIgnoreCase("Product")) {
            System.out.print("Enter features: ");
            String features = input.next();
            System.out.print("Enter product type: ");
            String productType = input.next();
            saleItems.add(new Product(name, price, features, productType, count));
        } else {
            System.out.println("Invalid product type.");
        }
        System.out.println("Product added successfully.");
    }

    private static void removeProduct(ArrayList<ProductForSale> saleItems, Scanner input) {
        System.out.print("Enter PRODUCT ID to remove: ");
        String removeProductID = input.next();

        boolean removed = false;
        for (int i = 0; i < saleItems.size(); i++) {
            if (saleItems.get(i).productID.equals(removeProductID)) {
                saleItems.remove(i);
                removed = true;
                System.out.println("Product removed successfully.");
                break;
            }
        }
        if (!removed) {
            System.out.println("Product ID not found.");
        }
    }

    private static void generateBill(ArrayList<ProductForSale> cart) {
        double total = 0.0;
        System.out.println("Generating Bill...");
        for (ProductForSale e : cart) {
            System.out.println(e.printProductDetails());
            total += e.getPrice(); // Total for each item in the cart
        }
        System.out.println("Total Bill Amount: $" + total);
    }

    private static void printProperly(ArrayList<ProductForSale> myList) {
        for (ProductForSale x : myList) {
            System.out.println(x.printProductDetails());
        }
    }
}
