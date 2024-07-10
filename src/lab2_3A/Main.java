package lab2_3A;

public class Main {

    public static void main(String[] args) {

        Positions manager = new Positions("Manager");
        Positions emp1 = new Positions("Employee 1");
        Positions emp2 = new Positions("Employee 2");

        emp1.setManager(manager);
    }
}
