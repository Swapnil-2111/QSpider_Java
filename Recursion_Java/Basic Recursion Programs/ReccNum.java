import java.util.Scanner;
public class ReccNum{
    public static void main(String[] args){
        System.out.println("Enter the number from where you want to start the series of the numbers till the last number 100:");
        int num=new Scanner(System.in).nextInt();
        printNum(num);
        
    }
    public static void printNum(int num){
        System.out.println(num);
        if(num==100)return;
        printNum(++num);

    }
}