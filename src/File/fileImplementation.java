package File;

import java.util.ArrayList;

public class fileImplementation implements Ifile{
    ArrayList<fileDetails> list = new ArrayList<>();
    @Override
    public void AddEmployee(fileDetails details) {
        list.add(details);
    }

    @Override
    public void deleteEmployee(int index, fileDetails details) {
        list.remove(index);
    }

    @Override
    public void updateEmployee(int index, fileDetails details) {
        list.set(index,details);
    }

    @Override
    public void Display() {
        for(fileDetails detail : list){
            System.out.println(detail);
        }
    }
}
