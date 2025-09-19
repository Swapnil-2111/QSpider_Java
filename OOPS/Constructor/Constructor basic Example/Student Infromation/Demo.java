// package Student Infromation;

class Student {
    String name;
    String email;
    String contact;

    Student (String name,String email, String contact){
        this.name=name;
        this.email=email;
        this.contact=contact;
    }

    public void displayStudent(){
        System.out.println(name+",Email:"+email+",contact:"+contact);
    }

}
public class Demo {
    public static void main(String[] args) {
        Student obj1=new Student("Swapnil", "swapnilmete2002@gmail.com", "8308399319");
        
        Student obj2=new Student ("Mohit","mohit2002@gmail.com","9876543210");
        
        obj1.displayStudent();
        obj2.displayStudent();
    }
}