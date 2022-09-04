
public class Statistics {
    private int count;
    private int sum;

    public Statistics(){
       this.count=count;
    }
    
    public void addNumber(int number){
        count++;
        sum=number+sum;
        
    }
    
    public int getCount(){
        return count;
    }
    
    public int sum(){
        
        return sum;
    }
    
    public double average(){
        double average = ((double)sum)/count;
        if(count==0){
            return 0;
        }
        return average;
    }
    
}
