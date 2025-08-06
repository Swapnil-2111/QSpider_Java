import java.util.*;

public class Marry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the AGE:");
        int age = sc.nextInt();

        System.out.println("Enter the propety:");
        int property = sc.nextInt();

        if (age > 21 && property > 10000000) {
            System.out.println("Eligible");
        }

        else {
            System.out.println("Enter your Sir Name");
            String sirName = sc.next();
            if (sirName.equals("AMBANI") || sirName.equals("Ambani")) {
                System.out.println("Eligible");
            }

            else {
                System.out.println("NOT ELIGIBLE");
            }
        }
    }
}
