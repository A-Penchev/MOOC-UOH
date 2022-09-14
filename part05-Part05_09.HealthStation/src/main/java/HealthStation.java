
public class HealthStation {
    private int weighings;
    
    public int weigh(Person person) {
        this.weighings++;
        int weight=person.getWeight();
        return weight;
    }
    public void feed(Person person){
        int a=person.getWeight();
        a++;
        person.setWeight(a);
    }
    public int weighings(){
        this.weighings=weighings;
        return this.weighings;
    }
}
