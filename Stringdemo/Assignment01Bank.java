abstract class BankAccounts {
    String CustomerName;
    String AccountType;
    long AccountNo;
    double AccountBalance;
    double AnnualInerest;
    double amount;
    int numOfDeposits;  // 0
    int numOfWithdraws;  //0
    double AnnualInterest;
    BankAccounts(String CustomerName, String AccountType, long AccountNo, double AccountBalance) {
        this.CustomerName = CustomerName;
        this.AccountType = AccountType;
        this.AccountNo = AccountNo;
        this.AccountBalance = AccountBalance;
    }
    void deposit(double amount) {
        AccountBalance = AccountBalance + amount;
        numOfDeposits++;
    }
    void getAccountDetails() {
        System.out.println(CustomerName + " " + AccountType + " " + AccountNo);
    }
    double getBalance() {
        return AccountBalance;
    }
    double getDeposits() {
        return numOfDeposits;
    }
    double getWithdraws() {
        return numOfWithdraws;
    }
    abstract double withdraw(double a);
}
class SavingAccount extends BankAccounts {
    SavingAccount(String Name, long AN, double AB) {
        super(Name, "Saving Account", AN, AB);
    }
    double withdraw(double amount) {
        if (AccountBalance < amount) {
            System.out.println("Sorry! You have low balance in you account");
        } else {
            AccountBalance = AccountBalance - amount;
            return AccountBalance;
        }
        return numOfWithdraws++;
    }
  
    double GetInterest() {
        AnnualInterest = 0;
        AnnualInterest = (AccountBalance*12*7) / 100;
        AccountBalance = AccountBalance + AnnualInterest;
        System.out.println("Annual Interest:" + AnnualInterest);
        return AccountBalance;
    }
}
class CurrentAccount extends BankAccounts {
    final static int serviceCharge = 100;
    CurrentAccount(String Name, long AN, double AB) {
        super(Name, "Current Account", AN, AB);
    }
    
    double withdraw(double amount) {
        if (AccountBalance < amount) {
            System.out.println("You have low balance in you account");
        } else {
            AccountBalance = AccountBalance - amount;
            AccountBalance = AccountBalance - (amount / 1000) * serviceCharge;
            System.out.println("Service Charge Rs. :" + (amount / 1000) * serviceCharge);
            System.out.println("Withdraw your balance successfull:" + amount);
            return AccountBalance;
        }
        return numOfWithdraws++;
    }
    void GetInterest() {
        System.out.println("No Interest Apply");
    }
}
public class Assignment01Bank {
	public static void main(String[] args) {
		
		SavingAccount Costomer1= new SavingAccount("Syed", 101, 70000);
		SavingAccount Costomer2 = new SavingAccount("Farhad", 102, 10000);
		CurrentAccount Costomer3 = new CurrentAccount("Azaad", 103, 14000);
		CurrentAccount Costomer4 = new CurrentAccount("Shaiwal", 104, 16000);
		CurrentAccount Costomer5 = new CurrentAccount("jitendra", 105, 20000);
        Costomer1.deposit(1000);
        System.out.println(Costomer1.getBalance());

        Costomer1.withdraw(80000);
    }
}