// package Health_Application;
import java.util.*;
public class ComputingBMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight in Pounds:");
        float weightPound=sc.nextFloat();
        float weightKg=weightPound*0.45359237f;
        System.out.println("Enter the Height in inches:");
        float heightInches=sc.nextFloat();
        float heightMeter=heightInches*0.0254f;
        float bmi=weightKg/(heightMeter*heightMeter);
        System.out.println("BMI is:"+bmi);
    }
}
