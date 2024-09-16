package File;

import java.io.*;

public class CheckedException {
    public static void main(String[] args){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt"))){
            writer.write("Igwe-Daniel Male 19 CEO");
            writer.write("Prince-Inala Male 18 IT");
            writer.write("Denzyl-Ibe Female 20 Support");
            writer.write("Emma-boi Male 18 Support");


        }catch(IOException e){
            throw new RuntimeException(e);
//            e.printStackTrace();
        }

        try(BufferedReader reader = new BufferedReader(new FileReader("student.txt"))){
           String Line;
           while((Line = reader.readLine()) != null){
               String[] splitting = Line.split("");
               String name = splitting[0].replace("-","");
               String gender = splitting[1];
               String age = splitting[2];
               String rank = splitting[3];
               System.out.println("fullName: " + name + "\nGender" + gender + "\nage" + age + "\nRank" + rank);
               System.out.println("---------------------");
           }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
