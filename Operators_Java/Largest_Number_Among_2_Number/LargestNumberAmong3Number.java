// package Largest_Number_Among_2_Number;
import java.util.*;
public class LargestNumberAmong3Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.print("The Largest Number is:");
        System.out.println(num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3));
    }
}
