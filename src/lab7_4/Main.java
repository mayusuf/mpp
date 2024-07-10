package lab7_4;

public class Main {
    public static void main(String[] args) {

        Duck duck1 = new MallardDuck();
        Duck duck2 = new DecoyDuck();
        Duck duck3 = new RedheadDuck();
        Duck duck4 = new RubberDuck();
        testDuck(duck1);
        testDuck(duck2);
        testDuck(duck3);
        testDuck(duck4);
    }

    public static void testDuck(Duck duck) {
        duck.display();
        duck.swim();

        if (duck instanceof FlyBehavior) {
            ((FlyBehavior) duck).fly();
        }

        if (duck instanceof QuackBehavior) {
            ((QuackBehavior) duck).quack();
        }
    }
}
