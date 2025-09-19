class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Member extends Person {
    int booksIssued;
    static int idCounter = 1000; // shared counter for all members
    int memberId; // unique for each member

    // Constructor chaining examples
    Member(String name) {
        this(name, 21); // default age
    }

    Member(String name, int age) {
        this(name, age, 2); // default 2 books issued
    }

    Member(String name, int age, int booksIssued) {
        super(name, age); // calling Person constructor
        this.booksIssued = booksIssued;
        this.memberId = ++idCounter; // generate unique ID
    }

    // Overloading: ability to issue extra books
    public void issueBooks(int count) {
        this.booksIssued += count;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Member ID: " + memberId);
        System.out.println("Books Issued: " + booksIssued);
    }
}

class Librarian extends Person {
    static int empCounter = 500; // shared counter for employees
    int employeeId;

    Librarian(String name, int age) {
        super(name, age);
        this.employeeId = ++empCounter; // generate unique ID
    }

    // Overloading: ability to assign task
    public void assignTask(String task) {
        System.out.println("Librarian " + name + " assigned task: " + task);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeId);
    }
}

public class Driver {
    public static void main(String[] args) {
        // Creating Members
        Member m1 = new Member("Rahul"); // uses constructor with default age
        Member m2 = new Member("Sagar", 25); // uses constructor with default booksIssued
        Member m3 = new Member("Priya", 22, 5); // fully customized

        // Creating Librarian
        Librarian l1 = new Librarian("Amit", 40);

        // Method overloading example
        m1.issueBooks(3); // Rahul issues 3 more books
        l1.assignTask("Update catalog");

        // Display details
        m1.displayDetails();
        System.out.println("--------------");
        m2.displayDetails();
        System.out.println("--------------");
        m3.displayDetails();
        System.out.println("--------------");
        l1.displayDetails();
    }
}
