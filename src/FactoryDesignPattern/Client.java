package FactoryDesignPattern;

// Client code to demonstrate the Factory Design Pattern
// It creates different products using factories without specifying the exact class of the product
//  thus promoting loose coupling and scalability
public class Client {
    public static void main(String[] args) {
        // Factory Design Pattern Demo
        Factory factory = new CarFactory();
        Product product = factory.createProduct();
        product.drive();
        product.displayInfo();

        factory = new ShipFactory();
        product = factory.createProduct();
        product.drive();
        product.displayInfo();
    }

}
