package org.example.part4.three;

import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Team:");
        String team = scanner.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner fileScanner = new Scanner(Paths.get("src/main/java/org/example/part4/three/sport.csv"))) {

            while (fileScanner.hasNextLine()) {

                String line = fileScanner.nextLine();
                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.parseInt(parts[2]);
                int visitingPoints = Integer.parseInt(parts[3]);

                if (team.equals(homeTeam)) {
                    games++;

                    if (homePoints > visitingPoints) {
                        wins++;
                    } else {
                        losses++;
                    }

                } else if (team.equals(visitingTeam)) {
                    games++;

                    if (visitingPoints > homePoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }


}

