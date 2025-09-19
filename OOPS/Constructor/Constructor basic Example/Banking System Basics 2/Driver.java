class Account{
    long accNumber;
    String accHolderName;
    double balance;

    Account(long accNumber, String accHolderName, double balance){
        this.accNumber=accNumber;
        this.accHolderName=accHolderName;
        this.balance=balance;
    }

    public void depositMoney(double amtmoney){
        this.balance+=amtmoney;
    }

    public void withdrawMoney(double amtmoney){
        if (amtmoney>0 && this.balance>amtmoney) {
            this.balance-=amtmoney;
        }
        else{
            System.out.println("Insufficient FUNDS!!!!");
        }
    }

    public void displayBalance(){
        System.out.println("Balance:"+balance);
    }
}

class SavingAccount extends Account{
    double interestRate;
    double minBalance;

    SavingAccount( long accNumber,String accHolderName, double balance, double interestRate, double minBalance){
        super(accNumber,accHolderName,balance);
        this.interestRate=interestRate;
        this.minBalance=minBalance;
    }

    public void addInterest(double amtmoney) {
        double interest=super.balance*(interestRate/100.0);  
        super.balance+=interest;
        System.out.println("The updated balance is:"+super.balance);      
    }
    @Override
    public void withdrawMoney(double amtmoney){
        if (this.balance-amtmoney>=minBalance) {
            super.balance-=amtmoney;
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }

}

public class Driver {
    public static void main(String[] args) {
        SavingAccount sa1=new SavingAccount(789456123012l,"Swapnil",2100000.0,11.0,11000.0);
        sa1.addInterest(21000);
        sa1.displayBalance();
    }
}
