package lab3_3B;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    public double computeArea(){

        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle \nRadius :" + radius + "\nArea: " + computeArea();
    }
}
