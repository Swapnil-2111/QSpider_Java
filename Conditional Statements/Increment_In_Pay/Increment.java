// package Increment_In_Pay;
import java.util.*;

public class Increment {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary=sc.nextDouble();
        double dupSal=salary;
        System.out.println("Enter your score:");
        int score=sc.nextInt();

        if (score<0 || score>100) {
            System.out.println("Invalid score"+score+"entered.");
            return;//terminates the execution
        }

        if (score>=90) {
            System.out.println("Your salary is reviced by 3%");
            salary=salary+(salary*0.03);
        }

        else{
            System.out.println("Your salary is revised by 1%");
            salary=salary+(salary*0.01);
        }

        System.out.println("Initial Salary:"+dupSal);
        System.out.println("Revised Salary:"+salary);
    }
}
