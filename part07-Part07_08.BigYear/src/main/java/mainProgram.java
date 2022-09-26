import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        ArrayList<Bird> birds=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("?");
            String command=scan.nextLine();
            if(command.equals("Quit")){
                break;
            }
        
            if(command.equals("Add")){
                System.out.println("Name: ");
                String name=scan.nextLine();
                System.out.println("Name in Latin: ");
                String nameLatin=scan.nextLine();
            
                String fullName=(name+" ("+nameLatin+")");
                Bird bird=new Bird(fullName,0);
                if(!birds.contains(bird)){
                    birds.add(bird);
                }
            }
            
            if(command.equals("Observation")){
                System.out.println("Bird?");
                String observedBird=scan.nextLine();
                for(Bird cycle:birds){
                    if(cycle.getName().contains(observedBird)){
                        cycle.addObservation();
                    }
                }
            }
            
            if(command.equals("All")){
                for(Bird cycle: birds){
                    System.out.println(cycle);
                }
            }
            
            if(command.equals("One")){
                System.out.println("Bird?");
                String printBird=scan.nextLine();
                for(Bird cycle: birds){
                if(cycle.getName().contains(printBird)){
                    System.out.println(cycle);
                    }
                }
            }
        }
    }

}
