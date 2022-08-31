
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest=-1;
        
        while(true){
            String input=scanner.nextLine();
            if(input.equals("")){
                break;
            }
        
        String[] inputs=input.split(",");
        
        int age=Integer.valueOf(inputs[1]);
        
        
        if(age>oldest){
            oldest=age;
            
        }
        if(oldest==age){
            System.out.println(inputs[0]);
 
        }
        
        }
    }
}
