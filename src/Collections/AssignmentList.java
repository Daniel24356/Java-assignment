package Collections;

import java.util.ArrayList;

public class AssignmentList {
    private int id;
    private String name;
    private final ArrayList<Integer> foods = new ArrayList<>();
//    update food
//    search for food
//    display all the food
//    Delete a food
//     Exit


    public AssignmentList(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getFoods() {
        return foods;
    }

    public void foodList(){
        System.out.println("\nfood_id"+ id +
                "\nName"+ name +
                "\nAll the foods"+ foods
        );
    }
}
