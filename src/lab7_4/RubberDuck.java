package lab7_4;

public class RubberDuck extends Duck implements FlyBehavior, QuackBehavior {

//    public RubberDuck() {
//        setFlyBehavior(new CannotFly());
//        setQuackBehavior(new Squeak());
//    }

    public void display(){

        System.out.println("displaying");
    }

    public void fly(){
        System.out.println("cannt fly");
    }

    public void quack(){
        System.out.println("squeaking");
    }
}
