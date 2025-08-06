// package Power Of An Element;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number and the power of the number of which you need the answer we will give it for you:");
        int num=sc.nextInt();
        int power=sc.nextInt();
        pwr(num,power);
        sc.close();

    }

    public static void pwr(int n, int p){
        int store=1;
        for(int i=0;i<p;i++){
            store=store*n;
        }
        System.out.println("The answer is:"+store);
    }
}
