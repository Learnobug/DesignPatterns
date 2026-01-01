package FactoryDesignPattern;

// Abstract Factory Class
// Defines the factory method to create products
public abstract class Factory {

    abstract public Product createProduct();

    public void infoproduct(){
        Product p = createProduct();
        p.displayInfo();
    }
}
