import java.util.Scanner;

public class IsEvenRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        boolean result = isEven(num);
        System.out.println(result ? true : false);
        sc.close();
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else
            return false;
    }
}
