package lab7_2;

public class EquilateralTriangle implements Polygon{

    private double side1;
    private double side2;
    private double side3;

    EquilateralTriangle(double side1) {
        this.side1 = side1;
        this.side2 = side1;
        this.side3 = side1;
    }

    @Override
    public double[] getSides() {
        return new double[] {side1, side2, side3};
    }
}
