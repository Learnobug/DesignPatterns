package Strategy;

// Context class - (Simple for client)
public class Broker {
    Payment strategy;

    Broker(Payment st){
        this.strategy = st;
    }

    void pay(int amount){
        strategy.pay(amount);
        strategy.paymentDetails();
    }

    // other - > static  (don't change)
}
