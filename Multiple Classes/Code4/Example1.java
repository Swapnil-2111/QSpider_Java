// package Multiple Classes.Code4;

public class Example1 {
    public static void main(String[] args) {
        Example1 obj=new Example1();
        obj.m3();
    }
    public void m3(){
        System.out.println("m3() non static example 1");
        Example3.m2();
        new Example2().m1();
    }

}
class Example3 {
    public static void m2(){
        System.out.println("m2() static Example3 class");
    }
}
