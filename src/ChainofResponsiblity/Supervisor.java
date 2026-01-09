package ChainofResponsiblity;

public class Supervisor extends  Approver{
    Supervisor (Approver nextApprover){
        super.setNextApprover(nextApprover);
    }
    @Override
    public void approveRequest(int amount) {
        if (amount <= 1000) {
            System.out.println("Supervisor approved request of amount: " + amount);
        } else if (nextApprover != null) {
            nextApprover.approveRequest(amount);
        }
    }
}
