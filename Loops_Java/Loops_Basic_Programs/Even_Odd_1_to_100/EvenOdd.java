
// package Even_Odd_1_to_100;
import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i <=num; i++) {
            if (i%2==0) {
                System.out.println(i+": Even");
            }else{
                System.out.println(i+": Odd ");
            }
        }
    }
}
