import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner=scanner;
        this.dictionary=dictionary;
    }
    public void start(){
       while(true){
        System.out.println("Command: ");
        String command=this.scanner.nextLine();
        if(command.equals("end")){
            System.out.println("Bye bye!");
            break;
        }
        if(command.equals("add")){
            System.out.println("Word: ");
            String word=this.scanner.nextLine();
            System.out.println("Translation: ");
            String translation=this.scanner.nextLine();
            
            this.dictionary.add(word,translation);
            continue;
        }
        if(command.equals("search")){
            System.out.println("To be translated: ");
            String searchWord=scanner.nextLine();
            if(dictionary.translate(searchWord)==null){
                System.out.println("Word "+searchWord+" was not found"); 
            }else{
                System.out.println("Translation: "+dictionary.translate(searchWord));
            }
            continue;
        }
        
            System.out.println("Unknown command");

        }
    }
}
