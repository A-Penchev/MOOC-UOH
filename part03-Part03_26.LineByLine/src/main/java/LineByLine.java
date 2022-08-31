
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String words=scanner.nextLine();
        String words2=scanner.nextLine();
        
        String[] pieces = words.split(" ");
        String[] pieces2 = words2.split(" ");
        for(int i=0;i<pieces.length;i++){
            System.out.println(pieces[i]);
        }
        for(int i=0;i<pieces2.length;i++){
            System.out.println(pieces2[i]);
        }

    }
}
