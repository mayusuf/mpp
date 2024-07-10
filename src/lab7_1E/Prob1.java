package lab7_1E;

interface A{
    default void show(){
        System.out.println("Display A");
    }

}

interface B extends A {
//    default void show(){
//        System.out.println("Display B");
//    }
    default void show(){
        System.out.println("Display B");
    }
}

interface C extends A {
    default void show(){
        System.out.println("Display C");
    }

}

class D implements B, C{

    @Override
    public void show() {
        C.super.show();
    }
}

public class Prob1 {
    public static void main(String[] args) {
        D d = new D();
        d.show();
    }
}
