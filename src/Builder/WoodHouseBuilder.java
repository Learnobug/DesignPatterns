package Builder;

public class WoodHouseBuilder extends HouseBuilder{
    public House house = new WoodHouse();

    @Override
    public HouseBuilder buildBasement(){
        house.basement = "Wood";
        return this;
    }
    @Override
    public HouseBuilder buildStructure(){
        house.Structure = "wood";
        return this;
    }
    @Override
    public HouseBuilder buildRoof(){
        house.roof = "wood";
        return this;
    }
    @Override
    public HouseBuilder buildInterior(){
        house.interior = "wood";
        return this;
    }
    @Override
    public House getHouse(){
        return house;
    }
}
