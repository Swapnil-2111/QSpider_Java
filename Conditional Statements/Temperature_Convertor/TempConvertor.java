// package Temperature_Convertor;
import java.util.*;
public class TempConvertor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for( ; ; ){
            System.out.println();
            System.out.println("/********  Welcome to the Smart Temperature Converter -->> Precision at Every Degree!*********/");
            System.out.println();
            System.out.println("Here you can convert different units of temperature to Degree Celsius");
            System.out.println("1.Fahrenheit    2.Kelvin    3.Rankine");

            System.out.println();
             
            System.out.println("To Exit Enter 0(Zero)");

            System.out.println();

            System.out.println("Enter your response");
            int userResp=sc.nextInt();
            // String response="";
            float celsius=0;
            float fahrenheit=0;
            float kelvin=0;
            float rankine=0;

            
            if (userResp==0) {
                return;
            }

            if (userResp==1) {
                System.out.println("Enter your temperature in Fahrenheit:");
                fahrenheit=sc.nextFloat();
                celsius=(fahrenheit-32f)*(5f/9f);
                System.out.println("Your entered temperature is "+fahrenheit+"F and its converted value is "+celsius +"Degee Celsius");
                continue;
            }

            else if (userResp==2) {
                System.out.println("Enter your temperature in kelvin:");
                kelvin=sc.nextFloat();
                celsius=(kelvin-273.15f);
                System.out.println("Your entered temperature is "+kelvin+"K and its converted value is "+celsius +"Degee Celsius");
                continue;
            }

            else if (userResp==3) {
                System.out.println("Enter your temperature in Rankine:");
                rankine=sc.nextFloat();
                celsius=(rankine-491.67f)*(5f/9f);
                System.out.println("Your entered temperature is "+rankine+"R and its converted value is "+celsius +"Degee Celsius");
                continue;
            }
            else {
                System.out.println("INVALID INPUT ENTERED");
                continue;
            }
        }
    }
}

