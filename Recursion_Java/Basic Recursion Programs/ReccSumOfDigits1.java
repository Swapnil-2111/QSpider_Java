import java.util.Scanner;
public class ReccSumOfDigits1 {
    static int num,dup;//0
    static int sum;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        dup=num;
        sumOfDigit();
        System.out.println(dup+":"+sum);
        sc.close();
    }

    public static void sumOfDigit(){
        //Process
        int rev=num%10;
        sum+=rev;
        num/=10;
        //Base Case
        if (num==0)return;
        //Recursive Call
        sumOfDigit();
    }
}
