package Builder;

public class WoodHouse extends House{

    WoodHouse(){}
    @Override
    public void showInfo() {
        System.out.println("This is a wooden house.");
    }

    @Override
    public void listFeatures() {
        System.out.println("Features of Wooden House:");
        System.out.println("- Wooden Basement" + basement);
        System.out.println("- Wooden Structure" + Structure);
        System.out.println("- Wooden Roof" +  roof);
        System.out.println("- Wooden Interior" + interior);
    }
}
