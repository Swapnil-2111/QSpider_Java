import java.util.*;
public class CalculateInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Balance:");
        double balance=sc.nextDouble();
        System.out.println("Enter the annual rate of interest");
        double rate=sc.nextDouble();
        double interest=0;
        interest=balance*(rate/1200);
        System.out.println("The interest is:"+interest);
    }
}
