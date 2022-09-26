import java.util.ArrayList;

public class Recipe {
    private String name;
    private String time;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, String time, ArrayList<String> ingredients){
        this.name=name;
        this.time=time;
        this.ingredients=ingredients;
    }
    public String getName(){
        return this.name;
    }
    public int getTime(){
        int time=Integer.valueOf(this.time);
        return time;
    }
    public ArrayList<String> getIngredient(){
        return this.ingredients;
    }
    public String toString(){
        return this.name+", cooking time: "+this.time;
    }
}
