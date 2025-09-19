class Student {
    int studId;
    String studName;
    String studCourse;
    double studMarks;

    Student(int studId,String studName, String studCourse, double studMarks){
        this.studId=studId;
        this.studName=studName;
        this.studCourse=studCourse;
        this.studMarks=studMarks;

    }

    Student(int studId,String studName){
        this(studId,studName,"NA",0.0);
    }

    public void displayDetails(){
        System.out.println("Student ID:"+studId);
        System.out.println("Student Name:"+studName);
        System.out.println("Student's Course:"+studCourse);
        System.out.println("Student Marks:"+studMarks);
    }
}

public class Driver {
    public static void main(String[] args) {
        Student s1= new Student(44, "Anvesh Gholap");
        Student s2=new Student(59, "Sagar Patil", "CDAC", 94.94);
        s1.displayDetails();
        s2.displayDetails();
    }
}
