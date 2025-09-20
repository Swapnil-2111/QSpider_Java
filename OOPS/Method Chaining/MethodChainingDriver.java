class MyInteger {
    int number;

    MyInteger(int number) {
        this.number = number;
    }

    // Display the current number
    public int displayMyInteger() {
        return number;
    }

    // Remove all even digits
    public MyInteger removeEven() {
        String op = "";
        for (int i = number; i > 0; i /= 10) {
            int rem = i % 10;
            if (rem % 2 != 0) { // keep odd digits
                op = rem + op;
            }
        }
        number = op.equals("") ? 0 : Integer.parseInt(op);
        return this;
    }

    // Remove all prime digits
    public MyInteger removePrime() {
        String op = "";
        for (int i = number; i > 0; i /= 10) {
            int rem = i % 10;
            if (rem != 2 && rem != 3 && rem != 5 && rem != 7) { // remove primes
                op = rem + op;
            }
        }
        number = op.equals("") ? 0 : Integer.parseInt(op);
        return this;
    }

    // Reverse the number
    public MyInteger reverseNumber() {
        int rev = 0;
        for (int i = number; i > 0; i /= 10) {
            int rem = i % 10;
            rev = rev * 10 + rem;
        }
        number = rev;
        return this;
    }
}

// Driver class
public class MethodChainingDriver {
    public static void main(String[] args) {
        MyInteger obj = new MyInteger(123456789);
        obj.removeEven().removePrime().reverseNumber();
        System.out.println(obj.displayMyInteger()); // prints the final number
    }
}
