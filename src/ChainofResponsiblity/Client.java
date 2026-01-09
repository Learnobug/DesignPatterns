package ChainofResponsiblity;

public class Client {
    public  static  void main(){
        Approver approver = new Supervisor(new Manager(new CEO()));
        approver.approveRequest(500);
        approver.approveRequest(10000);
        approver.approveRequest(100000);
        approver.approveRequest(100000000);
    }

}
