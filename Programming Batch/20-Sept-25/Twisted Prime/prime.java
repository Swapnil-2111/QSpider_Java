// package Twisted Prime;
import java.util.*;

class TwistedPrime {

    int number;
    TwistedPrime(int number){
        super();
        this.number=number;
    }

    public void displayNumber(){
        System.out.println(number);
    }

    public TwistedPrime checkPrime(){
        int temp=2;
        while (temp*temp<number) {
            if (number%temp==0) {
                break;
            }
            temp++;
        }
        if (temp*temp>number) {
            System.out.println("Prime Number.");
        }else{
            System.out.println("Not Prime Number.");
        }
        return this;

    }

    public TwistedPrime reverseNumber(){
        int temp=number;
        int rev=0;
        while (number!=0) {
            int rem=number%10;
            rev=rev*10+rem;
            number/=10;
        }
        number=rev;
        return this;
    }
}
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();

        TwistedPrime tp=new TwistedPrime(num);
        tp.checkPrime().reverseNumber().checkPrime();
        

    }    
}
