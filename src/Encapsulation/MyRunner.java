package Encapsulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyRunner {
    public static void main(String[] args) throws FileNotFoundException {


        try{
            String location = "C:\\Users\\kavit\\Downloads\\Delimiterd.txt";
            File file = new File(location);
            Scanner scanner = new Scanner(file);
            ArrayList<course> data = new ArrayList<course>();


            while(scanner.hasNextLine()){
                String Line = scanner.nextLine();

                String[] splitedLine = Line.split(",");
                course cObj = new course();

                cObj.setCode(splitedLine[0]);

               



                data.add(cObj);
            }

            for (course c : data) {
                System.out.println(c.getCode() + " | " + c.getCourse_name() + "|" + c.getInstructor_name());
                System.out.println("===============================");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found! ");
            e.printStackTrace();
        }
    }
}







