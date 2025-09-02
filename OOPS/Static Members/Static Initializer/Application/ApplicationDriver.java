// package Static Initializer.Application;
import java.util.Scanner;
public class ApplicationDriver {
    static String myPin=System.getenv("myPin");
    static{
        Scanner sc=new Scanner(System.in);
        boolean assumption=false;
        for(int i=3;i>=1;i--){
            System.out.println("Enter your pin :");
            String pin=sc.next();
            if (pin.equals(myPin)) {
                assumption=true;
                break;
            }
            else{
                System.out.println("Invalid Pin ");
                System.out.println("Attempt left:"+(i-1));
            }
        }
        if (!assumption) {
            System.exit(0);
        }
        
    }
    public static void main(String[] args){
        launchApplication();
    }
    public static void launchApplication(){
        System.out.println();
        System.out.println("PhonePay \n HOMEPAGE");
    }
}
