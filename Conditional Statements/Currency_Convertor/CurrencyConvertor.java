import java.util.*;
public class CurrencyConvertor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(;;){
            System.out.println();
            System.out.println(" @@@@@@@        WELCOME           @@@@@@");
            System.out.println();
            System.out.println("List of Currency");
            System.out.println("1.USD");
            System.out.println("2.EUR");
            System.out.println("3.BitCoin");
            System.out.println("4.BHD");
            System.out.println("For EXIT Enter 0");
            System.out.println();

            System.out.println("Enter the Currency Code:");
            String code=sc.next().toUpperCase();

            System.out.println("Enter your Amount");
            float inr=sc.nextFloat();

            boolean asump=true;
            float con=0;

            if (code.equals("USD")) {
                con=inr/85.5950f;
            }else if (code.equals("EUR")) {
                con=inr/100.427f;
            }
            else if (code.equals("BITCOIN")) {
                con=inr/9535540f;
            }
            else if (code.equals("BHD")) {
                con=inr/227.619f;
            }
            else if (code.equals("0")) {
                System.out.println();
                System.out.println("Thank U Visit Again");
                return;
            }
            else{
                System.out.println();
                System.out.println("Invalid Currency Code i.e.");
                asump=false;
            }
            if (asump) {
                System.out.println(inr +"INR :"+con+" "+code);
            }
        }
    }
}