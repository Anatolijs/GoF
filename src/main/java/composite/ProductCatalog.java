package composite;

import java.util.ArrayList;

public class ProductCatalog extends Catalog {

    private ArrayList<Catalog> items = new ArrayList<Catalog>();
    private String name;

    public ProductCatalog(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print(){
        for(Catalog catalog : items)
        {
            catalog.print();
        }
    }

    @Override
    public void add(Catalog catalog){
        items.add(catalog);
    }

    @Override
    public void remove(Catalog catalog){
        items.remove(catalog);
    }
}
