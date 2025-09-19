// fpackage Perfect Number;
import java.util.*;
public class perfect {
    //Perfect Number:Sum of factors excluding the given number is equal to the number then that numbers is perfect number.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int den=1;
        int sum=0;
        while(den<=num/2){
            if (num%den==0) {
                sum+=den;
            }
            den++;
        }
        if(num==sum){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a perfect Number");
        }
        sc.close();
    }
}
