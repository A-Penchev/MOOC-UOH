
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points pointsTotal=new Points();
        
        System.out.println("Enter point totals, -1 stops: ");
        while(true){
            int input=Integer.valueOf(scanner.nextLine());
            if(input==-1){
                break;
            }
            if(input>=0&&input<=100){
                pointsTotal.add(input);
                pointsTotal.addGrades(input);
            }
        }
        System.out.println("Point average (all): "+pointsTotal.average());
        System.out.println("Point average (passing): "+pointsTotal.averagePassing());
        System.out.println("Pass percentage: "+pointsTotal.passingPercentage());
        System.out.println("Grade distribution: ");
        int grade=5;
        while(grade>=0){
            int stars=pointsTotal.numberOfGrades(grade);
            System.out.print(grade+": ");
            while(stars>0){
                System.out.print("*");
                stars--;
            }
            System.out.println("");
            grade--;
        }
    }
}
