package lab7_1E;

import java.util.Scanner;

interface Math {
    static int addition(int a,int b){
        return a+b;
    }
    int add(int a, int b);
}

class AB implements Math {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

public class Prob2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        AB ab = new AB();
        System.out.println(ab.add(a, b));
        System.out.println(Math.addition(a, b));
    }
}