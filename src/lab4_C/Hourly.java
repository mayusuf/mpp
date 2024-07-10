package lab4_C;

public class Hourly extends Employee{

    private double hourlyWage;
    private double hoursPerWeek;
    private double sal;
    private Paycheck paycheck;

    Hourly(String empId, double hourlyWage, double hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(int month, int yr) {

        this.paycheck = calcCompensation(12, 2024);
        this.sal = this.hourlyWage * this.hoursPerWeek;
        paycheck.getNetPay(this.sal);
        return  this.sal;
    }

    public String print(){

        return "Hourly Employee \n" + "Id: " + this.empId + "\n" + "Gross Pay: " + this.sal + "\n" + this.paycheck.print();
    }
}
