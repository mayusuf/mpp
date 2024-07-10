package lab5_3;

public final class Circle implements Area{

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea(){
            return Math.PI * radius * radius;
    }

}
