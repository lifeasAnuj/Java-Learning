package com.Anuj;

public class Television extends ProductForSale{
    private String model;
    private boolean isHdr;


    public Television(String name,double price,String model,boolean isHdr){
        this(name,price,model,isHdr,1);
    }

    public Television(String name,double price,String model,boolean isHdr,int count){
        super(name,price,count);
        this.isHdr = isHdr;
        this.model = model;
    }

    @Override
    public String printProductDetails(){
        String  x  = super.printProductDetails();
        return String.format("%s | %s | %s |",x,model,isHdr);
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
