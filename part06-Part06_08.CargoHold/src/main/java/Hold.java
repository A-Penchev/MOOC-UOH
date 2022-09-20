import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> hold;
    private int maximumWeight;
    
    public Hold(int maximumWeight){
        this.hold=new ArrayList<>();
        this.maximumWeight=maximumWeight;
    }
    public void addSuitcase(Suitcase suitcase){
        int totalHoldWeight=0;
        for(Suitcase caseWeight: hold){
            totalHoldWeight+=caseWeight.totalWeight();
            }
        if(totalHoldWeight+suitcase.totalWeight()<=this.maximumWeight){
                hold.add(suitcase);
        }
    }
    public String toString(){
        int totalHoldWeight=0;
        for(Suitcase caseWeight: hold){
            totalHoldWeight+=caseWeight.totalWeight();
            }
        return this.hold.size()+" suitcases ("+totalHoldWeight+" kg)";
    }
    public void printItems(){
        for(Suitcase cases: hold){
            cases.printItems();
            }
        }      
}
