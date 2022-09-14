
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archive=new ArrayList<>();
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier=scanner.nextLine();
            if(identifier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name=scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            Archive input=new Archive(identifier,name);
            if(!archive.contains(input)){
                archive.add(input);
            }
        }
        System.out.println("==Items==");
        for(Archive i: archive){ 
            System.out.print(i.getID());
            System.out.print(": ");
            System.out.print(i.getName());
            System.out.println("");  
        }


    }
}
