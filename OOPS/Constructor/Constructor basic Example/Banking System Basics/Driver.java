class Account{
    String accHolderName;
    long accNumber;
    double balance;

    Account(String accHolderName, long accNumber, double balance){
        this.accHolderName=accHolderName;
        this.accNumber=accNumber;
        this.balance=balance;
    }

    public void depositMoney(double amount){
        this.balance+=amount;
    }

    public void withdrawMoney(double amount){
        this.balance-=amount;
    }

    public void checkBalance(){
        System.out.println("Total Balance is:"+balance);
    }
}


public class Driver {
    public static void main(String[] args) {
        Account a1=new Account("Sunil Mete", 123498760129l, 510000);
        Account a2=new Account("Indu Mete", 987601291234l, 51000);
        a1.depositMoney(a2.balance);
        a2.depositMoney(a1.balance);
        a1.checkBalance();
        a2.checkBalance();
    }
}
