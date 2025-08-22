// package Multiple Classes.Code3;
public class Example {
    public static void main(String[] args) {
        System.out.println("Main()");
        m1();
    }
    public static void m1(){
        System.out.println("m1() STATIC method");
    }
    public static void m2(){
        System.out.println("m2() static method");
    }
    static{
        m1();
        System.out.println("static block");
    }
}
