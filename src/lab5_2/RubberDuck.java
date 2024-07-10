package lab5_2;

public class RubberDuck extends Duck{

    public RubberDuck() {
        setFlyBehavior(new CannotFly());
        setQuackBehavior(new Squeak());
    }

    public void display(){
        System.out.println("displaying");
    }
}
