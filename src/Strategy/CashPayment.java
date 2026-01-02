package Strategy;

public class CashPayment implements Payment{

    private int lastpayedamount;
    @Override
    public void pay(int amount){
        this.lastpayedamount = amount;
        System.out.println("Pay by Cash :" + amount);
    }
    @Override
    public void paymentDetails(){
        System.out.println("Cash detail of payment : " + lastpayedamount);
    }

}
