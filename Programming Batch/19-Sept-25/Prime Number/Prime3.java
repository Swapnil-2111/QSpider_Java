// package Prime Number;
import java.util.*;

public class Prime3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int den=2;
        while(den<=num/2){
            if (num%den==0) {
                break;
            }
            den++;
        }
        if (den>num/2) {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        sc.close();
    }    
}
