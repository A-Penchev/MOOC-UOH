
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {
    
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for(int i: numbers){
            if(i>=lowerLimit&&i<=upperLimit)
            System.out.println(i);
        }
       
           
    }
    
}
