public class Printing_Numbers {
    static int num=1;
    public static void main(String[] args) {
        printNumber();
    }
    public static void printNumber(){
        System.out.println(num+" ");
        if (num++==100) {
            return;
        }
        printNumber();
    }
    
}