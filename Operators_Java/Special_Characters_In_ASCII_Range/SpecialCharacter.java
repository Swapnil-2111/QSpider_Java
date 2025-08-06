// package Special_Characters_In_ASCII_Range;
import java.util.*;
public class SpecialCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character you want to enter:");
        char ch=sc.next().charAt(0);
        System.out.println(!((ch>='A'&& ch<='Z')||(ch>='a'  && ch<='z')||(ch>='0' && ch<='9')));
    }
}
