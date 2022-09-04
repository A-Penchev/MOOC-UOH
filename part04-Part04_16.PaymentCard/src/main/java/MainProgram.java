import java.util.Scanner;
public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentCard paulsCard = new PaymentCard(20.0);//new card for paul
        PaymentCard mattsCard = new PaymentCard(30.0);//new card for matt
        
        paulsCard.eatHeartily();//paul eats expensive -4.6 from bal
        mattsCard.eatAffordably();//matt eats cheap -2.6 from bal
        
        System.out.println("Paul: "+paulsCard.toString());//get the bal for paul
        System.out.println("Matt: "+mattsCard.toString());//get the bal for matt
        
        paulsCard.addMoney(20);//paul topsup with 20 euro
        mattsCard.eatHeartily();//matt eats expensive 
        
        System.out.println("Paul: "+paulsCard.toString());//get the bal for paul
        System.out.println("Matt: "+mattsCard.toString());//get the bal for matt
        
        paulsCard.eatAffordably();//paul eats cheap
        paulsCard.eatAffordably();//paul eats cheap
        
        mattsCard.addMoney(50);//matt tops up 50 euro
        
        System.out.println("Paul: "+paulsCard.toString());//get the bal for paul
        System.out.println("Matt: "+mattsCard.toString());//get the bal for matt
    }
}
