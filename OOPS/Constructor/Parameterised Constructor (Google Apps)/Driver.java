class Google {
    String firstName;
    String lastName;
    String email;
    String password;
    long contact;
    String dob;
    String gender;

    public Google(String firstName, String lastName, String email, long contact, String password, String dob,
            String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contact = contact;
        this.password = password;
        this.dob = dob;
        this.gender = gender;
    }

    public void displayGoogle() {
        System.out.println("\n GOOGLE ACCOUNT DETAILS:");
        System.out.println("FirstName:" + firstName);
        System.out.println("LastName:" + lastName);
        System.out.println("Email:" + email);
        System.out.println("Password:" + password);
        System.out.println("Contact:" + contact);
        System.out.println("DOB:" + dob);
        System.out.println("Gender:" + gender);

    }
}

class GoogleMeet extends Google {
    String schedule;
    String duration;
    final int CAPACITY = 100;
    int join;

    public GoogleMeet(String schedule, String duration, int join, String firstName, String lastName, String email,
            long contact, String dob, String gender) {
        super(firstName, lastName, email, contact, email, dob, gender);
        this.schedule = schedule;
        this.duration = duration;
        this.join = join;
    }
}

class GoogleClassroom extends Google {
    String subject;
    String course;
    String code;
    String trainer;
    int numberStudents;

    public GoogleClassroom(String subject, String course, String code, String trainer, int numberStudents,
            String firstName, String lastName, String email, long contact, String dob, String gender) {
        super(firstName, lastName, email, contact, email, dob, gender);
        this.subject = subject;
        this.course = course;
        this.code = code;
        this.trainer = trainer;
        this.numberStudents = numberStudents;
    }
}

class Bank {
    String name;
    long number;
    double balance;

    public Bank(String name, long number, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public void displayBank() {
        System.out.println("\n Bank Details:");
        System.out.println("Bank Name:" + name);
        System.out.println("Number:" + number);
        System.out.println("Balance:" + balance);
    }
}

class GooglePay extends Google {
    long upiId;
    int pin;
    Bank bank;

    public GooglePay(String firstName, String lastName, String email, long contact, String password, String dob,
            String gender, long upiId, int pin, Bank bank) {
        super(firstName, lastName, email, contact, password, dob, gender);
        this.upiId = upiId;
        this.pin = pin;
        this.bank = bank;
    }

    public void displayGooglePay() {
        System.out.println("\n Google Pay Details:");
        System.out.println("UPI ID:" + upiId);
        System.out.println("Pin:" + pin);
        System.out.println("Bank details:" + this.bank.name);
        this.bank.displayBank();
    }
}

public class Driver {
    public static void main(String[] args) {
        GooglePay obj1 = new GooglePay("Ramesh", "Kumar", "rameshkumar@gmail.com", 1234567890l, "6987gyb1123",
                "01/01/2000", "Male", 9874523101l, 1234, new Bank("SBI", 9876543210l, 50000));
        obj1.displayGooglePay();
    }
}
