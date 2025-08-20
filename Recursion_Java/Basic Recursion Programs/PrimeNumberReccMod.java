import java.util.*;
public class Prime NumberReccMod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if (isPrime(sc.nextInt(),2)) {
            System.out.println("Prime Number.");
        }
        else{
            System.out.println("Not Prime Number.");
        }
    }

    public static boolean isPrime(int num, int start){
        if (num<2) return false;
        if (start>num/2) return true;
        if (num%start==0) {
            return false;
        }
        return isPrime(num, ++start);
    }
}
