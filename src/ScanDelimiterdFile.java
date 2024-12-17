import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanDelimiterdFile {
    public static void main(String[] args) throws FileNotFoundException {

        try{
            String location="C:\\Users\\kavit\\Downloads\\Delimiterd.txt";
            File file = new File(location);
            Scanner scanner = new Scanner(file);
            ArrayList<String[]> list = new ArrayList<String[]>();
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] words = line.split(",");
                list.add(words);
            }
            for(String[] words : list){
                System.out.println(words[0]);

            }

        }
        catch(Exception e){
            System.out.println("File not found!");
            e.printStackTrace();
        }

    }

}
