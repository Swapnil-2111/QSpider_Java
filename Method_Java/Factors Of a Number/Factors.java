// package Factors Of a Number;
import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        factors( num);
        sc.close();
    }

    public static void factors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if (n%i==0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Count:"+count);
    }
}
