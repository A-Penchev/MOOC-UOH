
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int numbersBetween;
        int amountOfNumbersBetween=0;
        int a;

        try(Scanner fileScan=new Scanner(Paths.get(file))){
            while(fileScan.hasNextLine()){
                    String line=fileScan.nextLine();
                    a=Integer.valueOf(line);
                for(numbersBetween=lowerBound;numbersBetween<=upperBound;numbersBetween++){
                    if(a==numbersBetween){
                        amountOfNumbersBetween++;
                    }
                }
            }
            System.out.println("Numbers: "+amountOfNumbersBetween);
    }   catch (IOException ex) {
            Logger.getLogger(NumbersFromAFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
