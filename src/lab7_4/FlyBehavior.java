package lab7_4;

public interface FlyBehavior {
    default void fly(){
        System.out.println("fly with wings");
    }

}
