package lab3_3B;

public class Cylinder {

    private double height;
    private Circle circle;

    public Cylinder(double radius, double height) {

        this.height = height;

        circle = new Circle(radius);
    }

    public double getHeight() {

        return height;
    }

    public double computeVolume() {

        return circle.computeArea() * height;
    }

    public String toString() {

        return "Cylinder \nRadius: " + circle.getRadius() + " Height: " + height + " Volume: " + computeVolume();
    }
}
