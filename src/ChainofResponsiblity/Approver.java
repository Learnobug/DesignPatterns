package ChainofResponsiblity;

public class Approver {
    public Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public  void approveRequest(int amount){}
}
