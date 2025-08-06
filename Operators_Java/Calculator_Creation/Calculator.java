// package Calculator_Creation;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num1:");
        float num1=sc.nextFloat();
        System.out.println("Enter Num2:");
        float num2=sc.nextFloat();
        System.out.println("Enter an operator");
        char opr=sc.next().charAt(0);
        String op="";
        op=
        (opr=='+')?
        (op+=num1+num2):
        ((opr=='-')?
        ((op+=num1-num2)):
        ((opr=='*')?
        (op+=num1*num2):
        ((opr=='/')?
        (op+=num1/num2):
        ((opr=='%')?
        (op+=num1%num2):
        (op+="INVALID")))));

        if (op.equals("INVALID")) {
            System.out.println("USER YOU HAVE ENTERED INVALID OPERATOR");
            return;// Terminates the exe of a method
        }
        System.out.println(num1+" "+opr+" "+num2+"="+op);
    }
}
