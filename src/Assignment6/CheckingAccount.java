package Assignment6;

public class CheckingAccount extends Account {

    static private double MinBalance = 100;
    static private double Fee =10;

    public CheckingAccount(String firstName, String lastName, double currentBalance) {
        super(firstName, lastName, currentBalance);
    }

    @Override
    public double creditTransaction(double creditAmount) {
        if(super.creditTransaction(creditAmount) < MinBalance){
            ChargeFee();
        }
        return CurrentBalance;
    }

    @Override
    public double debitTransaction(double debitAmount) {
        if(super.debitTransaction(debitAmount) < MinBalance){
            ChargeFee();
        }
        return CurrentBalance;
    }

    private void ChargeFee(){
        CurrentBalance = CurrentBalance - Fee;
    }

    // Simple Unit Test
    public static void main(String[] args)
    {
        CheckingAccount ch1 = new CheckingAccount("Steve", "Jobs", 50); // he was poor once before
        System.out.println(ch1);

        ch1.debitTransaction(0.25); // he was cheap back then too
        System.out.println(ch1);    // should be $39.75 (= $49.75 - $10 fee)

        ch1.creditTransaction(7.00); // small expense check
        System.out.println(ch1);     // should be $36.75 (= $39.75 + $7.00 - $10 fee)

        ch1.creditTransaction(1000000); // a huge bonus!!
        System.out.println(ch1); // should be $1000036.75
    }
}
