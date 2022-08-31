
public class AdvancedAstrology {

    public static void printStars(int number) {
        for(int i=0;i<number;i++){
            System.out.print("*");
        } 
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for(int c=1;c<=number;c++){
            System.out.print(" ");
        } 
    }

    public static void printTriangle(int size) {
        int k=1;
        while(k<=size){
            printSpaces(size-k);
            printStars(k);
            k++;
        }
    }

    public static void christmasTree(int height) {
        int j=1;
        
        while(j<=height){
            printSpaces(height-j);
            printStars(2*j-1);
            j++;
        }
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
        
    
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
