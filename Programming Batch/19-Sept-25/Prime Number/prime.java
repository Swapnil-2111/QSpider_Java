// package Prime Number;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=2;
        while (temp<num) {
            if (num%temp==0) {
                System.out.println("Not prime");
                return;
            }
            temp++;
        }
        System.out.println("Prime Number.");

    }
}
