package lab4_C;

public abstract class Employee {
    public String empId;

    Employee(String empId) {
        this.empId = empId;
    }

    public String print(){

        return empId;
    }

    public Paycheck calcCompensation(int month, int yr){

        return new Paycheck();
    }

    public abstract double calcGrossPay(int month, int yr);
}
