package lab7_4;

public class DecoyDuck extends Duck implements FlyBehavior, QuackBehavior {

//    public DecoyDuck() {
//        setFlyBehavior(new CannotFly());
//        setQuackBehavior(new MuteQuack());
//    }

    public void display(){

        System.out.println("displaying");
    }

    public void fly() {
        System.out.println("cannt fly");
    }

    public void quack() {
        System.out.println("cannt quack");
    }
}
