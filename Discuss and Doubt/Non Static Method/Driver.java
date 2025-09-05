// package Discuss and Doubt.Non Static Method;
class Parent{
    public void m1(){
        System.out.println("Parent m1()");
    }
    public void m2(){
        System.out.println("m2() parent");
    }
}

class Child extends Parent{
    @Override
    public void m1(){
        System.out.println("m1() child");
    }
    public void m3(){
        System.out.println("m3() child");
    }
}
public class Driver {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
