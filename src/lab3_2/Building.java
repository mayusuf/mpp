package lab3_2;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private List<Apartment> apartments;
    private double maintenanceCost;

    public Building(double maintenanceCost) {

        this.apartments = new ArrayList<>();
        this.maintenanceCost = maintenanceCost;
    }

    public void addApartment(Apartment apartment) {
        this.apartments.add(apartment);
    }

    public double getMaintenanceCost() {
        return this.maintenanceCost;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public double getBuildingProfit(){

        return getTotalRent() - getMaintenanceCost();
    }

    public double getTotalRent() {

        double totalRent = 0;
        for (Apartment apartment : apartments) {
            totalRent += apartment.getRent();
        }

        return totalRent;
    }
}
