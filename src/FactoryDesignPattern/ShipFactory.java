package FactoryDesignPattern;

public class ShipFactory extends Factory{

    @Override
    public Product createProduct() {
        return new Ship();
    }
}
