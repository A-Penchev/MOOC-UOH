
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        int add=first+second;
        int minus=first-second;
        int mult =first*second;
                
        System.out.println(first+ " + "+second+ " = "+add);    
        System.out.println(first+ " - "+second+ " = "+minus);  
        System.out.println(first+ " * "+second+ " = "+mult);  
        System.out.println(first+" / "+second+" = "+(1.0*first/second));
    }
}
