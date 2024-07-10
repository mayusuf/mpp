package lab5_2;

public class MallardDuck extends Duck{

    public MallardDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    public void display(){
        System.out.println("display");
    }
}
