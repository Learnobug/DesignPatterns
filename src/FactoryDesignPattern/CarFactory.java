package FactoryDesignPattern;

public class CarFactory extends Factory{

    @Override
    public Product createProduct() {
        return new Car();
    }
}
