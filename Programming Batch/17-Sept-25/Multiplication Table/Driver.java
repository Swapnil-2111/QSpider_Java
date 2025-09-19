// package Multiplication Table;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        System.out.println("Enter the number of which you want the multiplication table of:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(num + "*" + i+"="+num*i);i++;
        }
    }
}
