// package Calculating_Energy;
import java.util.*;
public class CalculatingEnergy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms:");
        double water=sc.nextDouble();
        System.out.println("Enter the initial temperature of the water:");
        double initialTemp=sc.nextDouble();
        System.out.println("Enter the final temperature of the water:");
        double finalTemp=sc.nextDouble();
        double q=water*(finalTemp-initialTemp)*4184;
        System.out.println("The energy needed is:"+q);
    }
}
