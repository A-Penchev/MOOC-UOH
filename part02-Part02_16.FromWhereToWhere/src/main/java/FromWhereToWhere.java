
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Where to? ");
        int g=Integer.valueOf(scanner.nextLine());
        System.out.println("Where from? ");
        int f=Integer.valueOf(scanner.nextLine());
  
        
        for(int i=f; i<=g; i++){
            System.out.println(i);
        }
    }
}
