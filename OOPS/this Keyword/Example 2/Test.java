class Driver{
    int a=20;
    public void m1(){
        int a= 10;
        System.out.println(a);
        System.out.println(this.a);
    }
}
public class Test {
    public static void main(String[] args) {
        Driver d = new Driver();
        d.m1();
    }
}
