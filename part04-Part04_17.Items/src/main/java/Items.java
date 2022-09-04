
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        
        while(true){
            System.out.println("Name: ");
            String name=scanner.nextLine();// receive new item names from user
            items.add(new Item(name));// add the new items to the list
            System.out.println(items.toString());// print the items class method
            if(name.isEmpty()){
                break;    
            }
        }
        
        

    }
}
