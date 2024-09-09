package Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(45);
        numbers.add(76);


//        Iterator<Integer> number = numbers.iterator();
//        while(number.hasNext()){
//            System.out.println(number.next());
//        }

//        for (int number: numbers){
//            System.out.println(number);
//        }

//        numbers.stream().forEach(System.out::println);

//        if(numbers.contains(23)) {
//            numbers.set(1,66);
//            System.out.println("Yes,");
//        }else{
//            System.out.println("nope");
//        }
//        numbers.stream().forEach(System.out::println);

//        boolean remove = numbers.remove(numbers.get(0));
//        if(remove){
//           System.out.println("Item deleted success");
//        }else{
//            System.out.println("something went wrong");
//        }
//        numbers.stream().forEach(System.out::println);

ArrayList<String> fruits = new ArrayList<>();
fruits.add("Banana");
fruits.add("Beans");
fruits.add("Oranges");

fruits.removeIf(fruit -> fruit.startsWith("s"));
       System.out.println(fruits);

    }
}
