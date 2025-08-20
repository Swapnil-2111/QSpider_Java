import java.util.Scanner;
public class palindromeRec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int store=isPalindrome(0,num,0,0);
        if (store==num) {
            System.out.println("Palindrome");;
        }
        else System.out.println("Not Palindrome");;
        sc.close();
    }

    public static int isPalindrome(int fetchNum, int num, int ans, int rev) {
    if (num == 0) {
        return ans; // 'ans' is holding the reversed number
    }
    fetchNum = num % 10; 
    ans = rev * 10 + fetchNum;  
    return isPalindrome(fetchNum, num / 10, ans, ans);
}

}
