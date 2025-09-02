// package Static Initializer;

public class StaticVariable {
    static String str="static Var";
    static{
        System.out.println(str);
    }
    {
        System.out.println(str);
    }
    StaticVariable(){
        System.out.println(str);
    }
    public static void m1(){
        System.out.println(str);
    }
    public void m2(){
        System.out.println(str);
    }
}
