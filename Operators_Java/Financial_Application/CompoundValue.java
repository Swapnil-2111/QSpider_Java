import java.util.*;
public class CompoundValue{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Saving you have with you:");
        double saving=sc.nextDouble();
        double rate=0.00417;
        //After the First month 
        double account=0;
        account=(account+saving)*(1+rate);
        account=(account+saving)*(1+rate);
        account=(account+saving)*(1+rate);
        account=(account+saving)*(1+rate);
        account=(account+saving)*(1+rate);
        account=(account+saving)*(1+rate);
        System.out.println("After six months account value is:"+account);
        sc.close();
    }
}