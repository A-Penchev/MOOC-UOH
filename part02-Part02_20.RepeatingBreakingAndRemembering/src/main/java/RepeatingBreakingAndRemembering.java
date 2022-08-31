
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Give numbers:");  
        
        int sum=0;
        int result=0;
        double average=0;
        int odd = 0;
        int even=0;
        
        
        
        while(true){
            int g=Integer.valueOf(scanner.nextLine());
            if(g==-1){
                break;
            }
            if(g!=-1){
                sum=sum+g;
                result++;
                average=(double)sum/result;
               
            }
            if(g%2==0){
                even++;
                
            }else{
                odd++;
                
            }
        }
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+result);
        System.out.println("Average: "+average);
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
            
    }
         
         
}

