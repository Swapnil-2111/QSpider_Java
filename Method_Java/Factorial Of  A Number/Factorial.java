// package Factorial Of  A Number;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which you want factorial of:");
        int fact=sc.nextInt();
        factorial(fact);
        sc.close();
    }

    public static void factorial(int f){
        int store=f;
        f--;
        while (f>0) {
            store*=f;
            f--;
        }
        System.out.println("Factorial:"+store);
    }
}
