package Builder;

public class StoneHouse extends House{


    StoneHouse(){}

    @Override
    public void showInfo() {
        System.out.println("This is a stone house.");
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
