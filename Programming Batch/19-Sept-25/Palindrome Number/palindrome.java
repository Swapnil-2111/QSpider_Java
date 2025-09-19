// package Palindrome Number;
import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=sc.nextInt();
        int temp=num;
        int ans=0;
        while (num!=0) {
            int last=num%10;
            ans=ans*10+last;
            num/=10;
        }
        if (temp==ans) {
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();

    }    
}
