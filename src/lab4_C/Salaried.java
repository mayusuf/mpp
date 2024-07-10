package lab4_C;

public class Salaried extends Employee{

    private double salary;
    private Paycheck paycheck;

    public Salaried(String empId, double salary) {
        super(empId);
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(int month, int yr) {
        paycheck = calcCompensation(12, 2024);
        paycheck.getNetPay(this.salary);
        return this.salary;
    }

    @Override
    public String print(){

        return "Salaried Employee \n" + "Id: " + this.empId + "\n" + "Gross Pay: " + this.salary + "\n" + this.paycheck.print();
    }
}
