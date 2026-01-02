package Strategy;

public class UPIPayment implements Payment{

    private int lastpayedamount;
    @Override
    public void pay(int amount){
        this.lastpayedamount = amount;
        System.out.println("Pay by UPI :" + amount);
    }
    @Override
    public void paymentDetails(){
        System.out.println("UPI detail of payment : " + lastpayedamount);
    }


}
