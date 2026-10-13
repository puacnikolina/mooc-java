package org.example.part4.three;

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    static void main() {

        try(Scanner s = new Scanner(Paths.get("src/main/java/org/example/part4/three/names.csv"))){
            while(s.hasNextLine()){
                String line = s.nextLine();

                String[] info = line.split(",");
                String name = info[0];
                String age = info[1];

                System.out.println(name + ", " + "Age: " + age);
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }


}
