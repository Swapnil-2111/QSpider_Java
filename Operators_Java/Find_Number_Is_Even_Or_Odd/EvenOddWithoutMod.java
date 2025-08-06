import java.util.*;
//Solving using formula
//(num/2)*2==num
// public class EvenOddWithoutMod {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int num=sc.nextInt();
//         int quo=(num/2);
//         quo*=quo;
//         boolean store=(num==quo);
//         System.out.println(store);
//     }
// }



//Another Method using 
//num/2==num/2.0;

public class EvenOddWithoutMod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        // num=(num/2);
        // float numf=0f;
        // numf=numf/2.0f;
        // boolean store=(num==numf);
        System.out.println(num/2==num/2.0);
    }
}





