
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        
        
        while(true){
            String inputs=scanner.nextLine();
            if(inputs.equals("")){
                break;
            }
            String[] input=inputs.split(",");
            
           
       
            
            for(int i=0;i<input.length;i++){
                while(Integer.valueOf(input[1])>i){
                    i=Integer.valueOf(input[1]);   
                }
                 System.out.println(i);
            }
            
           
                
            }
        
    }
}
