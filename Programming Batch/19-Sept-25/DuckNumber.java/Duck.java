import java.util.*;

public class Duck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println(num);
        while (num!=0) {
            if (num%10==0) {
                break;
            }
            num/=10;
        }
        if (num==0) {
            System.out.println("It is not a duck number");
        }
        else{
            System.out.println("It is a duck Number.");
        }
        sc.close();
    }

}
