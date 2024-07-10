package lab3_2;
import java.util.*;

public class Landlord {

    private String name;
    private List<Building> buildings;

    public Landlord(){
        buildings = new ArrayList<>();

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addBuilding(Building building){
        buildings.add(building);
    }

    public List<Building> getBuildings(){
        return buildings;
    }

    public double calcProfits(){

        double profit = 0;

        for(Building building : buildings){
            profit +=building.getBuildingProfit();
        }

        return profit;
    }
}
