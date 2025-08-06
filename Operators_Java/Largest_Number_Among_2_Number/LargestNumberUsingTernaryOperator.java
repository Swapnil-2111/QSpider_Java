// package Largest_Number_Among_2_Number;
import java.lang.*;
import java.util.Scanner;
public class LargestNumberUsingTernaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.print("The Largest Number is:");
        System.out.println(num1>num2?num1:num2);
    }
}
