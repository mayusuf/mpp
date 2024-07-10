package lab7_4;

public interface QuackBehavior {
    default void quack(){
        System.out.println("quacking");
    }
}
