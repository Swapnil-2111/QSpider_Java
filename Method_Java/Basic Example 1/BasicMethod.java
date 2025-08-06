import java.util.*;
public class BasicMethod {
    static int num; // 0
    public static void main(String[] args) {
        //check if number is even or odd
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();
        //if a number is valid then block gets executed
        if (checkNumber()) {
            if (num%2==0) {
                System.out.println(num+" is Even");
            }
            else{
                System.out.println(num+" 22344is Odd");
            }
        }
        else{
            System.out.println("Invalid number "+num);
        }
    }

    public static boolean checkNumber(){
        if (num<=0) {
            return false;
        }
        else{
            return true;
        }
    }
}
