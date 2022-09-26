import java.nio.file.Paths;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File to read: ");
        String fileName=scanner.nextLine();
        
        ArrayList<Recipe> recipes=readFromFile(fileName);
        
        System.out.println("Commands:\n" +"list - lists the recipes\n" +"stop - stops the program\n"+"find name - searches recipes by name\n"+"find cooking time - searches recipes by cooking time\n"+"find ingredient - searches recipes by ingredient");
        while(true){
            System.out.println("Enter command: ");
            String command=scanner.nextLine();
        
            if(command.equals("stop")){
                break;
            }
            if(command.equals("list")){
                for(Recipe cycle: recipes){
                    System.out.println(cycle.toString());
                }
            }
            if(command.equals("find name")){
                System.out.println("Searched word: ");
                String searchedWord=scanner.nextLine();
                for(Recipe cycle: recipes){
                    if(cycle.getName().contains(searchedWord)){
                        System.out.println(cycle.toString());
                    }
                }
            }
            if(command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int maxTime=Integer.valueOf(scanner.nextLine());
                for(Recipe cycle: recipes){
                    if(cycle.getTime()<=maxTime){
                        System.out.println(cycle.toString());
                    }
                }
            }
            if(command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String searchedIngredient=scanner.nextLine();
                for(Recipe cycle: recipes){
                    if(cycle.getIngredient().contains(searchedIngredient)){
                        System.out.println(cycle.toString());
                    }
                }
            }
        }
            
        
    }
    public static ArrayList<Recipe> readFromFile(String fileName) {
        ArrayList<Recipe> recipes=new ArrayList<>();
        ArrayList<String> ingredients;
                String name;
                String time;    

        try(Scanner fileScan=new Scanner(Paths.get(fileName))){
            while(fileScan.hasNextLine()){
                name=fileScan.nextLine();
                time=fileScan.nextLine();
  
                ingredients = new ArrayList<>();
                while(fileScan.hasNextLine()) {
                    String currLine = fileScan.nextLine();
                if (currLine.isEmpty()) { 
                    break; }
                    ingredients.add(currLine);
                }   
                recipes.add(new Recipe(name, time, ingredients)); 
            }
                } catch (IOException ex) {
            Logger.getLogger(RecipeSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
        return recipes;
    }
}
