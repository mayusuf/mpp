package lab5_2;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void quack(){
        quackBehavior.quack();
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("swimming");
    }

    public void display(){}

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

}
