class Example {
    Example() {
        System.out.println("Constructor Example");
    }

    static {
        System.out.println("Static Block Example");
    }
    {
        System.out.println("Non Static Block");
    }

    void m1() {
        System.out.println("m1() non static Example");
    }
}

public class ExampleDriver4 {

    static Example obj = new Example();
    static {
        System.out.println("Static block ExampleDriver4");
    }

    public static void main(String[] args) {
        System.out.println("main()");
        obj.m1();
    }
}
