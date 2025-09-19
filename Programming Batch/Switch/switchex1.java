import java.util.Scanner;

public class switchex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String op=sc.nextLine();
        System.out.println("Enter the value 1");
        int n1=sc.nextInt();
        System.out.println("Enter the value 2");
        int n2=sc.nextInt();
        int ans=switch(op){
            case "Addition" -> n1+n2;
            case "Subtraction" -> n1-n2;
            case "Multiplication" -> n1*n2;
            case "Division" -> n1/n2;
            default -> {
                System.out.println("Invalid Operation");
                yield 0;
            }
        };
        System.out.println("The output :");
        System.out.println(ans);
    }
}


// Yield is used when we want to return a value after execution of few statements
