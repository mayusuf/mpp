package lab5_3;

public final class Rectanlge implements Area{

    private final double width;
    private final double length;

    public Rectanlge(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double computeArea(){
        return width * length;
    }

}
