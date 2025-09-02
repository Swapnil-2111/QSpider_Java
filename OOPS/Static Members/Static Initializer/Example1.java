// package Static Initializer;

public class Example1 {
    static int a=10;
    public static void main(String[] args){
        Example2.m1();
        new Example2().m2();
    }
}

class Example2{
    static int b=Example1.a;
    public static void m1(){
        System.out.println(Example1.a);
        System.out.println(b);
        System.out.println("m1() non - static Example2");
    }

    public void m2(){
        System.out.println(Example1.a);
        System.out.println(b);
        System.out.println("m2() non-static Example2");
    }
}
