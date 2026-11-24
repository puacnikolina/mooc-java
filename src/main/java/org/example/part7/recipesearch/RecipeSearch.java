package org.example.part7.recipesearch;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    private static ArrayList<Recipe> recipes = new ArrayList<>();

    static void main() {

        Scanner s = new Scanner(System.in);
        System.out.println("File to read: ");
        String file = s.nextLine();
        loadData(file);
        while(true){
            System.out.println("Enter command: ");
            String input = s.nextLine();

            switch(input){
                case "stop" -> {return;}
                case "list" -> {
                    System.out.println("Recipes:");
                    printData();
                }
                case "find name" -> {
                    System.out.print("Searched word: ");
                    String name = s.nextLine();
                    findByName(name);
                }
                case "find cooking time" -> {
                    System.out.print("Max cooking time: ");
                    int time = Integer.parseInt(s.nextLine());
                    findByCookingTime(time);
                }
                case "find ingredient" -> {
                    System.out.print("Ingredient: ");
                    String ingredient = s.nextLine();
                    findByIngredient(ingredient);
                }
            }

        }


    }

    private static void loadData(String fileName){
        try (Scanner file = new Scanner(Paths.get("C:\\aPROGRAMIRANJE\\JAVA\\JavaProggramingOne\\src\\main\\java\\org\\example\\part7\\recipesearch\\"+fileName))) {
            while (file.hasNextLine()) {
                String name = file.nextLine();
                int time = Integer.parseInt(file.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while(file.hasNextLine()){
                    String line = file.nextLine();
                    if(line.isEmpty()){
                        break;
                    }
                    ingredients.add(line);
                }
                recipes.add(new Recipe(name, time, ingredients));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    private static void printData() {
        for (Recipe r : recipes) {
            System.out.println(r.getName() + ", cooking time: " + r.getCookingTime());
        }
    }

    private static void findByName(String name){
        for(Recipe r : recipes){
            if(r.getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(r.getName() + ", cooking time: " + r.getCookingTime());
            }
        }
    }
    private static void findByCookingTime(int time) {
        for(Recipe r : recipes){
            if(r.getCookingTime() <= time){
                System.out.println(r.getName() + ", cooking time: " + r.getCookingTime());
            }
        }

    }
    private static void findByIngredient(String ingredient){
        for(Recipe r : recipes){
            if(r.getIngredients().contains(ingredient)){
                System.out.println(r.getName() + ", cooking time: " + r.getCookingTime());
            }
        }
    }
}
