package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Que {
    public static void main(String[] args) {
        Queue<String> orderList = new LinkedList<>();
        orderList.add("King");
        orderList.add("Prince");
        orderList.add("Daniel");
        orderList.add("Akarolo");
        orderList.add("David");

        Iterator<String> iterator = orderList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        String peek = orderList.peek();
//        System.out.println(peek);
        String remove = orderList.remove();
        System.out.println(remove);
        String peek = orderList.peek();
        System.out.println(peek);

        Queue<CharList> chats = new LinkedList<>();
        chats.add(new CharList(1,"Daniel"));
        chats.add(new CharList(2,"King"));
        chats.add(new CharList(3,"Prince"));
        System.out.println(chats.size() + "users before you");
        CharList removal = chats.remove();
        chats.poll();
        System.out.println(chats.size() + "users before you");

    }
}
