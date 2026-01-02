package Builder;


// Constrcution of Object is step by step
// Immutable object creation (No Setter methods) (only muttable state during object creation  to provide immutability after object creation)
// Director Builder Class help to construct object with or without optional parameters and also ordering of steps
// Builder class remove the telescoping constructor anti pattern
// Builder class enable object create validation before object creation
// single responsibility principle is followed as the object creation logic is separated from the object business logic
//A builder doesn’t expose the unfinished product while running construction steps. This prevents the client code from fetching an incomplete result.
public class Client {
    public static void main(String[] args) {
        HouseBuilder builder = new StoneHouseBuilder();
        House h = builder.buildStructure().buildBasement().buildInterior().buildRoof().getHouse();
        h.showInfo();
        h.listFeatures();
        House h2 = new Director(new WoodHouseBuilder()).Constructwothoutint();
        h2.showInfo();
        h2.listFeatures();
    }

}
