package Decorator;

public class OliveDecorator extends Decorator{
    public OliveDecorator(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Olive";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75;
    }
}
