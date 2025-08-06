// package Cost_Of_Driving;
import java.util.*;
public class CostOfDriving {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the driving distance:");
        float drive=sc.nextFloat();
        System.out.println("Enter miles per gallon:");
        float milesPerGallon=sc.nextFloat();
        System.out.println("Enter the price per gallon:");
        float pricePerGallon=sc.nextFloat();
        float AmtOfGallon=drive/milesPerGallon;
        System.out.println("The cost of Driving is $:"+AmtOfGallon*pricePerGallon);
    }
}
