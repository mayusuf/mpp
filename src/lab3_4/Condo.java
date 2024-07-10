package lab3_4;

import java.util.ArrayList;
import java.util.List;

public class Condo extends Property{

    private double rent;
    private double numFloors;
    private Address address;

    public Condo(double numFloors, String street, String city, String state, String zip) {

        super(numFloors);
        this.numFloors = numFloors;
        address = new Address(street, city, state, zip);
    }

    public double computeRent() {
        this.rent =  400 * this.numFloors;
        return this.rent;
    }

}
