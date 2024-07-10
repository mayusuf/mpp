package lab3_4;

import java.util.ArrayList;
import java.util.List;

public class Trailer extends Property{

    private double rent;

    private Address address;

    public Trailer(double rent,String street, String city, String state, String zip) {

        super(rent);
        this.rent = rent;
        address = new Address(street, city, state, zip);
    }

    public double computeRent() {
        return this.rent;
    }

}
