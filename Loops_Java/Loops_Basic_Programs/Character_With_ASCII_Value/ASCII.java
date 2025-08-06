// package Character_With_ASCII_Value;

public class ASCII {
    public static void main(String[] args) {
        for(char ch=0;ch<=127;ch++){
            if (ch>=65 &&ch<=90 || ch>=97 && ch<=122) {
                System.out.println(ch+":"+(ch+0));
            }
        }
    }
}
