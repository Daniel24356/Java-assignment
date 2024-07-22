package org.aptechph;

public class Computation {
    public int addTwo (int a, int b){
        return a + b;
    }

    public void greet (String name){
        System.out.println("Hello dear " + name);
    }

    public void divideTwo(int a, int b){
        if(b != 0){
            System.out.println(a/b);
        }
//            System.out.println('Daniel');
    }

}
