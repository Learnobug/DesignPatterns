package FactoryDesignPattern;

public class Car implements Product{

    @Override
    public void drive() {
        System.out.println("Driving a car.");
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a car.");
    }
}
