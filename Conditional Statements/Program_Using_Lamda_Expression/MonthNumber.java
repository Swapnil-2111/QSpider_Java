// package Program_Using_Lamda_Expression;
import java.util.*;

public class MonthNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // int number = 1;

        if (number < 1 || number > 12) {
            System.out.println("INVALID INPUT");
            return;
        }

        String month = switch (number) {
            case 1 -> "JAN";
            case 2 -> "FEB";
            case 3 -> "MAR";
            case 4 -> "APR";
            case 5 -> "MAY";
            case 6 -> "JUN";
            case 7 -> "JUL";
            case 8 -> "AUG";
            case 9 -> "SEP";
            case 10 -> "OCT";
            case 11 -> "NOV";
            case 12 -> "DEC";
            default -> "INVALID";
        };

        System.out.println(number + ":" + month);
    }
}
