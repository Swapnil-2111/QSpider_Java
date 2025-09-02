// package Static 2;

// public class staticExample2 {
//     staticExample2(){
//         m1();
//     }
//     {
//         m1();
//     }
//     public static void m1(){
//         System.out.println("m1() static method");
//     }
//     public void m2(){
//         m1();
//         System.out.println("m2() non static method");
//     }
// }


class staticExample2{
    public static void main(String[] args) {
        System.out.println("main() from Example2 Class ");
        Example.m1();
    }

}
class Example{
    public static void m1(){
        System.out.println("m1() from Example class");
    }
}