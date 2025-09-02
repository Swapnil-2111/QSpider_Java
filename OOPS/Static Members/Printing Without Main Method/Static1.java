//Printing without the main method using static block.
public class Static1 {
    static{
        System.out.println("Helloooo from static block");
        m1();
        System.out.println("BYE from static block");
        System.out.println("Searching for the main thread");
        System.exit(0);
    }

    public static void m1(){
        System.out.println("m1() starts");
        System.out.println("m1()ends");
    }
}
