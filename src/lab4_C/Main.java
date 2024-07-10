package lab4_C;

public class Main {
    public static void main(String[] args) {

        Employee[] emp = {
                new Hourly("1003", 25, 40),
                new Salaried("1001", 9000),
                new Commissioned("1004", 2000)
        };

        for (Employee e : emp) {

            e.calcGrossPay(12, 2024);
            System.out.println(e.print());

        }
    }
}
