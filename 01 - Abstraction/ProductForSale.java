package com.Anuj;

public abstract class ProductForSale {
    protected String name;
    protected String productID;
    protected double price;
    protected int count;

    private static int counter = 100;



    public abstract void manageStocks(boolean add, int number);
    public abstract void manageDiscount(double discount);

    // Constructor with count parameter, defaults to 1 if not provided
    public ProductForSale(String name, double price, int count) {
        this.name = name;
        this.productID = "QZNB" + Integer.toString(counter);
        counter++;
        this.price = price;
        this.count = (count > 0) ? count : 1; // Ensure count is at least 1
   // Increment static variable after assigning productID
    }

    // Constructor without count parameter, defaults count to 1
    public ProductForSale(String name, double price) {
        this(name, price, 1);
    }

    // Concrete methods
    public String printProductDetails() {
        return String.format("%s | %s | %.2f | Count: %d", name, productID, price, count);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return " ";
    }
}
