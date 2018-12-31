package composite;

public abstract class Catalog {

    public void add(Catalog catalog){
        throw new UnsupportedOperationException("Cannot add item to catalog.");
    }

    public void remove(Catalog catalog){
        throw new UnsupportedOperationException("Cannot remove item from catalog.");
    }

    public String getName(){
        throw new UnsupportedOperationException("Cannot return name.");
    }

    public double getPrice(){
        throw new UnsupportedOperationException("Cannot return price.");
    }

    public void print(){
        throw new UnsupportedOperationException("Cannot print.");
    }
}
