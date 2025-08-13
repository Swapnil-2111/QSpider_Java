import java.util.Scanner;
public class SumOfDigit2 {
    static int sum;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        sumOfDigit(num);
        System.out.println(num+":"+sum);
    }
    public static void sumOfDigit(int num){
        sum+=(num%10);
        num/=10;
        if (num==0) {
            return;
        }
        sumOfDigit(num);
    }
}
