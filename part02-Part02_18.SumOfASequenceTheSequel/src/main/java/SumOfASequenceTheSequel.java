
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        int g=Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int f=Integer.valueOf(scanner.nextLine());
        int sum=0;
        
        for(int i=g; i>=g&&i<=f; i++){
            sum=sum+i;
            System.out.println("THe sum is: "+sum);
        }
    }
}
