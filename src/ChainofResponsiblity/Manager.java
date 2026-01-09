package ChainofResponsiblity;

public class Manager extends  Approver{
    Manager(Approver nextApprover){
        super.setNextApprover(nextApprover);
    }
    @Override
    public void approveRequest(int amount) {
        if(amount <= 10000){
            System.out.println("Manager approved request of amount: " + amount);
        } else if(nextApprover != null){
            nextApprover.approveRequest(amount);
        }
    }
}
