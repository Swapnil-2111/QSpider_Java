class Parent {
    public void m1(){
        System.out.println("m1() parent");
    }
}

class Child extends Parent{
    public void m1(){
        System.out.println("m1() Child");
        System.out.println(this);
    }
}

class Example{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.m1();
        System.out.println(obj);
    }
}