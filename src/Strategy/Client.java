package Strategy;


//Delegate the dynamic or changeable logic in separate class with common interface
//composition (has-a relationship) is better than inheritance
// code is extensible and follow open-close principle
// context class(Broker) don't need to execute a concrete strategy. object of concrete  will be passed at runtime.
// one object  with functionalities with different way of implementaion should be implemented by interface
// You can swap algorithms used inside an object at runtime.
public class Client {
    static void main() {
        Payment method = new CashPayment();
        Broker br = new Broker(method);
        br.pay(500);
    }
}
