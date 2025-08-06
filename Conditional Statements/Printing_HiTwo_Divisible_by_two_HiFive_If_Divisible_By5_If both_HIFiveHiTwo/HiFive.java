// package Printing_HiTwo_Divisible_by_two_HiFive_If_Divisible_By5_If both_HIFiveHiTwo;
import java.util.Scanner;
public class HiFive {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(num%2==0){
            if (num%5==0) {
                System.out.println("HiFiveHiTwo");
            }
            if (num%5!=0) {
                System.out.println("HiTwo");
            }
        }
        if (num%2!=0) {
            if (num%5==0) { 
                System.out.println("HiFive");
            }
        }
        
    }
}
