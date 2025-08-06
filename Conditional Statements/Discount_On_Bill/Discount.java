import java.util.*;
public class Discount {

    public static void main(String[] args) {
        System.out.println("Shopping Starts");
        System.out.println("Enter your bill amount:");
        double billAmount=new Scanner(System.in).nextDouble();
        double dics=15;
        if(billAmount>=5000){
            System.out.println("You got"+dics+"% discount.");
            billAmount=(billAmount)-(billAmount/100)*dics;
        }
        System.out.println("Total Bill:"+billAmount+"Rs");
        System.out.println("Shopping Ends");
    }
}