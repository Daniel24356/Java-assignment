package Collections;


import java.util.Iterator;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
//        tree , graph , recursion
        Stack<String> history = new Stack<>();
        history.push("abc.com");
        history.push("abc.com");
        history.push("abc.com");
        history.push("abc.com");
        history.push("abc.com");
//        String popItem = history.pop();
//        System.out.println(popItem);

        String peekItem = history.peek();
        System.out.println(peekItem);

        Iterator<String> iterator = history.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("********");
        for(String his : history){
            System.out.println(his);
        }

        for(int i=0;i< history.size(); i++){
            System.out.println(history.get(i));
        }

    }
}
