
// package Grade_Calculator;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks out 500");
        int totMarks = sc.nextInt();
        if (totMarks < 0 || totMarks > 500) {
            System.out.println("Invalid Marks entered!!@@");
            return;
        }
        float percent = (totMarks / 500f) * 100;
        
        System.out.println("Your Percent is:"+percent);
        if (percent > 0 && percent < 35) {
            System.out.println("FAILED");
        } else if (percent >= 35 && percent < 50) {
            System.out.println("Passed:D");
        } else if (percent >= 50 && percent < 60) {
            System.out.println("Passed With Second Class : C");
        } else if (percent >= 60 && percent < 75) {
            System.out.println("Passed with First Class:B");
        } else if (percent >= 75 && percent < 90) {
            System.out.println("Passed with First class with distinction: A");
        } else if (percent>=90 && percent<=100) {
            System.out.println("Passed with flying colors.(Distinction):O");
        }
        // else{
        //     System.out.println("You entered negative marks");
        // }
    }
}
