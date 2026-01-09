package ChainofResponsiblity;

public class CEO extends  Approver{
    @Override
    public void approveRequest(int amount) {
        if(amount <= 100000){
            System.out.println("CEO approved the request of amount: " + amount);
        } else {
            System.out.println("Request of amount: " + amount + " requires board approval.");
        }
    }
}
