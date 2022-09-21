
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first=new Container();
        Container second=new Container();
        
        while (true) {
            System.out.println("First: "+first.toString());
            System.out.println("Second: "+second.toString());
            
            String input = scan.nextLine();
            if (input.contains("quit")){
                break;
            }    
            
            String[] parts = input.split(" ");
            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(amount<0){
                amount=0;
            }
            
              
            if(command.equals("add")){
                first.add(amount);
                
            }else if(command.equals("move")){
                if(amount<=first.contains()){
                    first.remove(amount);
                    second.add(amount);
                }else{
                    second.add(first.contains());
                }
            }else if(command.equals("remove")){
                second.remove(amount);    
            }
        }
    }

}
