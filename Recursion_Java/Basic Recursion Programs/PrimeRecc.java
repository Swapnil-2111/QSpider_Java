import java.util.Scanner;
public class PrimeRecc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check the number is prime or not:");
        int num=sc.nextInt();
        int iterate=1;
        int count=0;
        int boo=isPrime(num, iterate, count);
        System.out.println((boo==2)?("Prime"):("Not Prime"));

    }

    public static int isPrime(int num,int iterate,int count){
        //Base Case
        if (iterate>num) {
            return count;
        }

        //Process
        if(num%iterate==0){
            count++;
        }
        iterate++;

        //Recursive Condition
        return isPrime(num, iterate, count);

    }
}
