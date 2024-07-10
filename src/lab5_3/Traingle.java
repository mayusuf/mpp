package lab5_3;

public final class Traingle implements Area{

    private final double base;
    private final double height;

    public Traingle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public double computeArea(){
        return 0.5*base*height;
    }
}
