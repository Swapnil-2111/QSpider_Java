import java.util.*;

public class NumberOfYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        double min = sc.nextDouble();

        double minInYear = 60 * 24 * 365; // minutes in a year = 525600
        double minInDay = 60 * 24;        // minutes in a day = 1440

        int years = (int)(min / minInYear); // full years
        double remainingMinutes = min % minInYear;
        int days = (int)(remainingMinutes / minInDay); // full days from remaining minutes

        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days.");
    }
}
