package lab2_3B;

public class Main {

    public static void main(String[] args) {

        Course prerequisite = new Course("FPP");

        Course mpp = new Course("MPP");
        Course asd = new Course("ASD");

        mpp.setPreCourse(prerequisite);
        asd.setPreCourse(null);

    }
}
