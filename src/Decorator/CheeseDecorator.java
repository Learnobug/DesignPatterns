package Decorator;

public class CheeseDecorator extends Decorator{
    public CheeseDecorator(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.25;
    }
}
