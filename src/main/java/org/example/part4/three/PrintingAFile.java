package org.example.part4.three;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    static void main() {

        Scanner s = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fileName = s.nextLine();
        String file = "src/main/java/org/example/part4/three/";
        file += fileName;

       try(Scanner fileScanner = new Scanner(Paths.get(file))){

           while(fileScanner.hasNextLine()){
               String line = fileScanner.nextLine();
               System.out.println(line);

           }


       }catch (Exception e){
           System.out.println("Error: " + e.getMessage());
       }

    }

}
