package Decorator;

public abstract class Decorator implements BasePizza {
    BasePizza basePizza;
    public Decorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    public  String getDescription(){
        return basePizza.getDescription();
    }
    public  double getCost(){
        return basePizza.getCost();
    }
}
