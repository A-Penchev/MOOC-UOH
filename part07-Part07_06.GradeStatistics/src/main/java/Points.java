import java.util.ArrayList;

public class Points {
    private ArrayList<Integer> pointsTotal;
    private ArrayList<Integer> grades;
    
    public Points(){
        this.pointsTotal=new ArrayList<>(); 
        this.grades=new ArrayList<>();
   }
    public void add(int point){
        this.pointsTotal.add(point);
    }
    public double average(){
        double sum=0;
        int count=0;
        for(int i: pointsTotal){
            sum+=i;
            count++;
        }
        return sum/count;
    }
    public double averagePassing(){
        double sum=0;
        int count=0;
        for(int i: pointsTotal){
            if(i>=50){
                sum+=i;
                count++;
            }
        }
        return sum/count;
    }
    public double passingPercentage(){
        double passing=0;
        int count=0;
        for(int i: pointsTotal){
            if(i>=50){
                passing++;
            }
            count++;
        }
        return 100*passing/count;
    }
    public void addGrades(int points){
        this.grades.add(pointsToGrades(points));
    }   
    public static int pointsToGrades(int points){
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }
    public int numberOfGrades(int grade){
        int count=0;
        for(int cycle: grades){
            if(cycle==grade){
                count++;
            }
        }
        return count;
    }
}
