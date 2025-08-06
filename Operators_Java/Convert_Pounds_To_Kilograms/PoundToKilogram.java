import java.util.*;
class PoundToKg{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight in pounds:");
        float pound=sc.nextInt();
        float kg=0.454f*pound;
        System.out.println(pound+": Pound is "+kg+"  Kilograms.");
    }
}