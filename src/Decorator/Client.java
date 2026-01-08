package Decorator;

public class Client {
    static void main() {
        BasePizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

        pizza = new OliveDecorator(pizza);
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());



    }
}
