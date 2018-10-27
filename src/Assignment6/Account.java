package Assignment6;

public class Account {
    protected String FirstName, LastName;
    protected double CurrentBalance;

    //mentods
    public Account(String firstName, String lastName, double currentBalance){
        FirstName = firstName;
        LastName = lastName;
        CurrentBalance = currentBalance;
    }

    public String getAcctType(){
        return this.getClass().getName();
    }

    public double debitTransaction(double debitAmount){
        return CurrentBalance = CurrentBalance - debitAmount;
    }

    public double creditTransaction(double creditAmount){
        return CurrentBalance = CurrentBalance + creditAmount;
    }

    public String toString(){
        return "Account name: " + FirstName + " " + LastName + ", Account Type: " + getAcctType() + ", Balance: " + String.format("$%.2f", CurrentBalance);
    }

    //unit test
    public static void main(String[] args)
    {
        Account account1 = new Account("John", "Smith", 100);
        Account account2 = new Account("Jay", "Chou", 1000000);
        System.out.println(account1);
        System.out.println(account2);

        account1.debitTransaction(30.25); // should be $69.75
        account2.debitTransaction(500000);
        System.out.println(account1);
        System.out.println(account2);

        account1.creditTransaction(10.10);
        account2.creditTransaction(100000);
        System.out.println(account1); // should be $79.85
        System.out.println(account2);
    }



}
