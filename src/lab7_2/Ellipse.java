package lab7_2;

public class Ellipse implements Polygon{

    private double semiMajorAxis;
    private double semiMinorAxis;

    Ellipse(double semiMajorAxis, double semiMinorAxis) {
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    @Override
    public double[] getSides() {
        return new double[] {this.semiMajorAxis, this.semiMinorAxis};
    }
}
