package Builder;

public abstract class HouseBuilder {

    abstract public HouseBuilder buildBasement();
    abstract public HouseBuilder buildStructure();
    abstract public HouseBuilder buildRoof();
    abstract public HouseBuilder buildInterior();
    abstract public House getHouse();
}
