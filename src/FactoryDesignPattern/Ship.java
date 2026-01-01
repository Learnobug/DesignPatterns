package FactoryDesignPattern;

public class Ship implements Product{

    @Override
    public void drive() {
        System.out.println("Sailing a ship.");
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a ship.");
    }
}
