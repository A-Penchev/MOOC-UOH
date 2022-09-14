public class Timer {
    private int value60;//count of 60 second timer
    
    private int value100;//count of hundreth of a second timer
    private int limit100=100;//hundredth of a second cannot pass passed 100 count total
    
    public Timer(){
        this.value100=0;//set the timer to start at 0
    }
    
    public void advance() {
        this.value100 = this.value100 + 1;//add one to the count for the hundredth
  
        if(this.value100==this.limit100){// check if value of hundredth equals to 100, if this happens we need to add 1 to the seconds timer
            this.value60++;// add 1 to seconds timer
        }
        if (this.value100 >= this.limit100) {//
            this.value100 = 0;
        }
        if(this.value60>60){
            this.value60=0;
        }
    }

    public int value100() {
        return this.value100;
    }
    public int value60() {

        return this.value60;
    }

    public String toString() {
        if (this.value100 < 10) {
            return "0" + this.value60+":"+"0"+this.value100;
        }

        return "" + this.value60+":"+""+this.value100;
    }
}