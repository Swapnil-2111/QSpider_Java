// package Financial_Application;
import java.util.*;

public class FareTip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the subtotal and the gratuity rate one by one:");
        double subTotal=sc.nextInt();
        double gratuity=sc.nextInt();
        gratuity=(gratuity/100)*subTotal;
        double total=gratuity+subTotal;
        System.out.print("The tip is:"+gratuity+" and total is:"+total);
        sc.close();
    }
}
