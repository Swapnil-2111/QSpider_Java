// package Prime Numbers;
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        prime(num);
        sc.close();
    }

    public static void prime(int pnum){
        int count=0;
        for (int i=1;i<=pnum;i++) {
            if (pnum%i==0) {
                count++;
            }
        }
        if (count==2) {
            System.out.println("Number :"+pnum + " is Prime.");
        }
        else{
            System.out.println("Number :"+pnum + " is not Prime.");
        }
    }
}
