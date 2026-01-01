package Builder;

public class StoneHouseBuilder extends HouseBuilder{
    public House house = new StoneHouse();

    @Override
    public HouseBuilder buildBasement(){
        house.basement = "stone";
        return this;
    }
    @Override
    public HouseBuilder buildStructure(){
        house.Structure = "stone";
        return this;
    }
    @Override
    public HouseBuilder buildRoof(){
        house.roof = "stone";
        return this;
    }
    @Override
    public HouseBuilder buildInterior(){
        house.interior = "stone";
        return this;
    }
    @Override
    public House getHouse(){
        return house;
    }
}
