// package Printing_A-Z_&&_a-z_&&_0-9;

public class PrintAll {
   public static void main(String[] args) {
    for(char ch=0; ch<=127;ch++){
        if (ch>=48 && ch<=57 || ch>=65 && ch<=90 || ch>=97 && ch<=122) {
            System.out.print(ch+" ");
        }
    }
   } 
}
