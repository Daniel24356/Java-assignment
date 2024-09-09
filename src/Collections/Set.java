package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Set {
    public static void main(String[] args) {
        java.util.Set<String> users  = new HashSet<>();
        users.add("mike");
        users.add("Daniel");
        users.add("King");
        users.add("Prince");
        users.remove("Daniel");

//        users.add("mike");

        users.forEach(System.out::println);
    }

    public static java.util.Set<Integer> removeDuplicate(){
        List<Integer> numbers;
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        java.util.Set<Integer> uniqueNo = new HashSet<>();
        uniqueNo.addAll(numbers);
        return uniqueNo;
    }
}
