package Builder;

public class Director {

    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House Constructwithint() {
        return houseBuilder
                .buildBasement()
                .buildStructure()
                .buildRoof()
                .buildInterior()
                .getHouse();
    }

    public House Constructwothoutint() {
        return houseBuilder
                .buildBasement()
                .buildStructure()
                .buildRoof()
                .getHouse();
    }
}
