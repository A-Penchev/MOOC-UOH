
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    public Money plus(Money addition) {
        int a=this.euros+addition.euros;
        int b=this.cents+addition.cents;
    Money newMoney = new Money(a,b); // create a new Money object that has the correct worth
    // return the new Money object
    return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if(this.euros<compared.euros){
            return true;
        }
        if(this.euros==compared.euros&&this.cents<compared.cents){
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser){
        int a=this.euros-decreaser.euros;
        int b=this.cents-decreaser.cents;
        
        
        if(b<0){
            a--;
            b=b+100;
        }
        if(a<0){
            a=0;
            b=0;
        }
    Money newMoney = new Money(a,b); // create a new Money object that has the correct worth
    // return the new Money object
    return newMoney;
    }
    

}
