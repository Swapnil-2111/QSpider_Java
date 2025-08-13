import java.util.Scanner;
public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int count=0;
        int rev=reverse(num,count);
        System.out.println("The reverse of the entered number "+num+" is :"+rev);
    }

    public static int reverse(int num, int rev){
        //Process
        int rem=num%10;
        rev=rev*10+rem;
        num/=10;
        //Base Case
        if (num==0) {
            return rev;
        }
        //Recursive Condition
        return reverse(num,rev);
    }
}
