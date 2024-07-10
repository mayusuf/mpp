package lab3_3A;

public class Cylinder {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {

        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double computeVolume() {

        return Math.PI * radius * radius * height;
    }

}
