package org.example.part7;

import java.util.Scanner;

public class GradeStatistics {

    static void main() {
        Scanner s = new Scanner(System.in);
        int countAll = 0;
        double sumAll = 0.0;
        int countPass = 0;
        double sumPass = 0.0;
        //indeks je ocena, a vrednost koju cuva je broj osoba koje imaju tu ocenu
        int[] grades = {0,0,0,0,0,0};
        System.out.println("Enter total points, -1 stops: ");
        while(true){
            String input = s.nextLine();
            if(input.equals("-1")){
                break;
            }
            int points = Integer.parseInt(input);
            if(points < 0 || points > 100){
                continue;
            }
            if(points >=50){
                sumPass += points;
                countPass++;
            }
            sumAll += points;
            countAll++;

//            if(points < 50){
//                grades[0]++;
//            }else if(points < 60){
//                grades[1]++;
//            }else if(points < 70){
//                grades[2]++;
//            }else if(points < 80){
//                grades[3]++;
//            }else if(points < 90) {
//                grades[4]++;
//            }else{
//                grades[5]++;
//            }

            int grade = points < 50 ? 0 : Math.min((points - 40) / 10,5);
            grades[grade]++;
        }
        System.out.println("Point average(all): " + sumAll / countAll);
        if(sumPass == 0.0){
            System.out.println("Point average (passing): -");
        }else{
            System.out.println("Point average(passing): " + sumPass / countPass);
        }
        System.out.println("Pass percentage: " + 100 * countPass / countAll);

        System.out.println("Grade distribution: ");
        for(int i = grades.length - 1; i >= 0; i--){
            System.out.print(i + ":");
            for(int j = 0; j < grades[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


}
