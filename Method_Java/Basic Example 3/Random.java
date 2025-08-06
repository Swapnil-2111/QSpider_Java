import java.util.Scanner;
public class Random {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Random Numbers Generator:");
        System.out.println("Tell me tell you I will provide you 10 random numbers:");
        randomnumbergenerator();
    }

    public static void randomnumbergenerator() {
        for(int i=0;i<9;i++){
            System.out.println ((int)((Math.random())*10));
        }
    }
}
