// package Convert_Feet_Into_Meters;
import java.util.*;
public class FeetToMeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number in FEET:");
        float feet=sc.nextFloat();
        float feetTomet=feet*0.305f;
        System.out.println(feet+" Feet is "+feetTomet+" meters.");
    }
}
