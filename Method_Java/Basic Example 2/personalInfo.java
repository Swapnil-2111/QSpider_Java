import java.util.Scanner;
public class personalInfo {
    static String name;
    static int age;
    static String gender;
    static String email;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Do you want to fill the personal details of yours in the program. If yes enter y/Y");
        char ch=sc.next().charAt(0);
        if (ch=='y'|| ch=='Y') {
            personal();
        }
        else{
            return;
        }
    }

    public static void personal(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");
        name=sc.nextLine();
        System.out.println("Enter your age:");
        age=sc.nextInt();
        System.out.println("Enter the gender:");
        gender=sc.next();
        System.out.println("Enter the email:");
        email=sc.next();
        System.out.println();
        System.out.println("Your details are:");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("Email:"+email);
    }
}
