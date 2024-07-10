package lab5_2;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    public void display(){
        System.out.println("displaying");
    }
}
