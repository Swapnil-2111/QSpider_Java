public class PrintReverseAlphabets {
    static char ch='Z';
    public static void main(String[] args){
        printAlphabets();
    }
    public static void printAlphabets(){
        System.out.println(ch+" ");
        if (ch--=='A') {
            return;
        }
        printAlphabets();
    }
}
