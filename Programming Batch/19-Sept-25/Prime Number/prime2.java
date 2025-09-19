// package Prime Number;
import java.util.*;
public class prime2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int den=2;
        while(den<num){
            if (num%den==0) {
                break;
            }
            den++;
        }
        if (den==num) {
            System.out.println("Prime");
        }

        else{
            System.out.println("NOT Prime");
        }
    }
}
