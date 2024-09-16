package File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("Assignment.txt"))){
            var files = new fileDetails("Igwe-Daniel",18,20000,"software");
            writer.write(String.valueOf(files));

            System.out.println("1. Add details of employee");
            System.out.println("2. delete details of employee");
            System.out.println("3. update details of employee");
            System.out.println("4. Display details of employee");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter option");
            var fileImplement = new fileImplementation();
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    fileImplement.AddEmployee(new fileDetails("Denzyl", 16,20000,"support"));
                    break;
                case 2:
                    fileImplement.deleteEmployee(1,new fileDetails("Denzyl", 16,20000,"support"));
                    break;
                case 3:
                    fileImplement.updateEmployee(2,new fileDetails("Denzyl", 16,20000,"support"));
                    break;
                case 4:
                    fileImplement.Display();
                    break;

            }


        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
