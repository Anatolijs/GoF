package facade.domain;

import composite.Catalog;

public class Product extends Catalog {

    public int productId;
    public String name;
    private double price;

    public Product(){}

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return  this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void print(){
        System.out.println("Product name: " + name + " Price: " + price);
    }
}
