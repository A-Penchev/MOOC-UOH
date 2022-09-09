import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> inputs=new ArrayList<>();
        
        int i=0;
        while(true){
            String input=scanner.nextLine();
            inputs.add(input);
            i++;
            if(input.contains("end")){
                break;
            }
        }
        System.out.println(i-1);
        
    }
}
