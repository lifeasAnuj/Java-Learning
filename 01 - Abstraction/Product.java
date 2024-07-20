package com.Anuj;

public class Product extends ProductForSale {
    private String type;
    private String features;


    public Product(String name,double price,String features,String type){
        this(name,price,features,type,1);
    }

    public Product(String name,double price,String features,String type,int count){
        super(name,price,count);
        this.type = type;
        this.features = features;

    }



    @Override
    public String printProductDetails(){
        String  x  = super.printProductDetails();
        return String.format("%s | %s |",x,features);
    }

    //Abstract Methods
    @Override
    public void manageDiscount(double discount){
        price -= (price * (discount/100));
        System.out.println("New Price : " + price);
    }

    @Override
    public void manageStocks(boolean add,int number) {
        count = (add) ? count + number : (count - number >= 0) ? count - number : -1;
    }

    @Override
    public String toString() {
        return " ";
    }
}
