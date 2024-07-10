package lab4_C;

final public class Paycheck {

    private double grosspay;
    private double fica = 0.23;
    private double state = 0.05;
    private double local = 0.01;
    private double medicare = 0.03;
    private double socialSecurity = 0.075;


    public String print(){

        return "Net Pay: " + grosspay + "\n";
    }

    public void getNetPay(double grossPay){

        this.grosspay = grossPay - grossPay*(this.fica+this.state+this.local+this.medicare+this.socialSecurity);

    }

}
