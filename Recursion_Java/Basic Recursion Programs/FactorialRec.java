import java.util.Scanner;

public class FactorialRec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int factNum=fac(num);
        System.out.println("Factorial:"+factNum);
    }

    public static int fac(int num){
        //Base Case
        if (num==1) {
            return 1;
        }

        //Recursive Call
        return (num*fac(num-1));
    }
}
