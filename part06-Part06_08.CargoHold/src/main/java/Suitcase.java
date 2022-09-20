import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;
    
    public Suitcase(int maximumWeight){
        this.items=new ArrayList<>();
        this.maximumWeight=maximumWeight;
    }
    public void addItem(Item item){
        int totalWeight=0;
        for(Item weight: items){
            totalWeight+=weight.getWeight();
        }
        if(totalWeight+item.getWeight()<=maximumWeight){
            items.add(item);
        }
    }
    public String toString(){
        int totalWeight=0;
        for(Item weight: items){
            totalWeight+=weight.getWeight();
        }
        if(totalWeight==0){
            return "no items (0 kg)"; 
        }
        if(items.size()==1){
           return "1 item ("+totalWeight+" kg)";
        }
        return items.size()+" items ("+totalWeight+" kg)";
    }
    public void printItems(){
        for(Item print: items){
            System.out.println(print.toString());
        }
    }
    public int totalWeight(){
        int totalWeight=0;
        for(Item weight: items){
            totalWeight+=weight.getWeight();
        }
        return totalWeight;
    }
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item heaviestItem=this.items.get(0);
        for(Item itemWeight: items){
            if(itemWeight.getWeight()>heaviestItem.getWeight()){
                heaviestItem=itemWeight;
            }  
        }
        return heaviestItem;
    }
    
    
    
}
