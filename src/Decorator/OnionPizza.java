package Decorator;

public class OnionPizza implements  BasePizza {
    @Override
    public String getDescription() {
        return "Onion Pizza";
    }

    @Override
    public double getCost() {
        return 6.50;
    }
}
