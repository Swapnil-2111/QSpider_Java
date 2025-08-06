import java.util.*;
public class AvgSpeed{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Distance in miles:");
        double distInMiles=sc.nextInt();
        double distInKms=1.6*distInMiles;
        System.out.print("Enter the Time Required to complete the journey:");
        System.out.println();
        System.out.print("Enter the number in hour place:");
        double hour=sc.nextInt();
        System.out.println();
        System.out.print("Enter the number in Minutes place:");
        double min=sc.nextInt();
        min=min/60;
        System.out.println();
        System.out.print("Enter the number in Second place:");
        double sec=sc.nextInt();
        sec=sec/(60*60);
        System.out.println();
        double totTime=hour+min+sec;
        double totDist=distInKms;
        double speed=totDist/totTime;
        System.out.println("The avg. speed required is:"+speed);

    }
}