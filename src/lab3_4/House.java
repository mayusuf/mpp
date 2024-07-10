package lab3_4;

import java.util.ArrayList;
import java.util.List;

public class House extends Property{

    private double rent;
    private double lotSize;
    private Address address;

    public House(double lotSize, String street, String city, String state, String zip) {
        super(lotSize);
        this.lotSize = lotSize;
        address = new Address(street, city, state, zip);
    }

    public double computeRent() {
        this.rent = 0.1 * this.lotSize;
        return this.rent;
    }


}
