
public class Archive {
    private String ID;
    private String name;
    
    public Archive(String ID, String name){
        this.ID=ID;
        this.name=name;
    }
    public String getID(){
        return this.ID;
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean equals(Object compared){
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive comparedItem = (Archive) compared;
   
        if(this.ID.equals(comparedItem.ID)){
            return true;
        }
        return false;
    }
    
}
