import java.util.ArrayList;

public class Bird {
    private String bird;
    private int observation;
    
    
    public Bird(String bird, int observation){
        this.bird=bird;
        this.observation=observation;
    }
    
    public String getName(){
        return this.bird;
    }
    public void addObservation(){
        this.observation++;
    }
    
    public String toString(){
        return this.bird+": "+this.observation+" observations";
    }
    
    
}
