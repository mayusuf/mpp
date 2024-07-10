package lab5_3;

public class Main {
    public static void main(String[] args) {

        Area[] areas = {new Circle(3), new Rectanlge(2,4), new Traingle(5, 4)};

        double totalArea = 0;

        for (Area area : areas) {
            totalArea += area.computeArea();
        }
        System.out.printf("%.2f", totalArea);
    }
}
