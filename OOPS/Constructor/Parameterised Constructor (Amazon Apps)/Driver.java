// Shallow and Deep Copy Example
// If we are not providing the separate constructor at the time of nested objects then that is shallow copy,
// else if we provide it then it is deep Copy.

class Address {
    String lane;
    String locality;
    String city;
    int pincode;

    Address(String lane, String locality, String city, int pincode) {
        this.lane = lane;
        this.locality = locality;
        this.city = city;
        this.pincode = pincode;
    }

    Address(Address address) {
        this.lane = address.lane;
        this.locality = address.locality;
        this.city = address.city;
        this.pincode = address.pincode;
    }

    public void displayAddress() {
        System.out.println("\n Address ");
        System.out.println("Lane:" + lane);
        System.out.println("Locality:" + locality);
        System.out.println("City :" + city);
        System.out.println("Pincode:" + pincode);
    }
}

class Amazon {
    String userName;
    String password;
    long contact;
    String email;
    Address address;

    Amazon(String userName, String password, long contact, String email, Address address) {
        this.userName = userName;
        this.password = password;
        this.contact = contact;
        this.email = email;
        this.address = address;
    }

    public void displayAmazon() {
        System.out.println("\n Amazon");
        System.out.println("User Name:" + userName);
        System.out.println("Password:" + password);
        System.out.println("Contact:" + contact);
        System.out.println("Email:" + email);
        address.displayAddress();
    }
}

class Bank {
    String name;
    String ifscCode;
    long accountNum;
    double balance;

    Bank(String name, String ifscCode, long accountNum, double balance) {
        this.name = name;
        this.ifscCode = ifscCode;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    Bank(Bank bank) {
        this.name = bank.name;
        this.ifscCode = bank.ifscCode;
        this.accountNum = bank.accountNum;
        this.balance = bank.balance;
    }

    public void displayBank() {
        System.out.println("\n Bank Details:");
        System.out.println("Name of Bank:" + name);
        System.out.println("IFSC CODE:" + ifscCode);
        System.out.println("Account Number:" + accountNum);
        System.out.println("Balance:" + balance);
    }
}

class AmazonPay extends Amazon {
    String upiId;
    Bank bank;
    int pin;
    double wallet;

    AmazonPay(String upiId, Bank bank, int pin, double wallet,
              String userName, String password, long contact, String email, Address address) {
        super(userName, password, contact, email, address);
        this.upiId = upiId;
        this.bank = bank;
        this.pin = pin;
        this.wallet = wallet;
    }

    // Copy Constructor (shallow copy)
    AmazonPay(AmazonPay oldObj) {
        super(oldObj.userName, oldObj.password, oldObj.contact, oldObj.email, oldObj.address);
        this.upiId = oldObj.upiId;
        this.bank = oldObj.bank;   // shallow copy
        this.pin = oldObj.pin;
        this.wallet = oldObj.wallet;
    }

    public void displayAmazonPay() {
        System.out.println("\n AMAZON PAY DETAILS");
        System.out.println("Upi ID:" + upiId);
        System.out.println("Pin:" + pin);
        System.out.println("Wallet:" + wallet);
        bank.displayBank();
    }
}

public class Driver {
    public static void main(String[] args) {
        Bank bank = new Bank("Ramesh Kumar", "SBINO12345", 51111345565L, 21212.51);
        Address address = new Address("JM Road", "Deccan", "Pune", 411005);

        AmazonPay oldObj = new AmazonPay(
                "7894@ybl1234", bank, 12312, 1500,
                "Ramesh Kumar", "ramesh@123", 987654321L, "rameshkumar@gmail.com", address);

        oldObj.displayAmazonPay();
        oldObj.displayAmazon();

        System.out.println("\n COPY OBJECT ");
        AmazonPay copyObj = new AmazonPay(oldObj);
        copyObj.displayAmazonPay();
        copyObj.displayAmazon();

        System.out.println("\n Changes in COPY\n ");
        copyObj.address.city = "Delhi"; // shallow copy effect
        copyObj.displayAmazon();

        System.out.println("Original Object:");
        oldObj.displayAmazon();
    }
}
