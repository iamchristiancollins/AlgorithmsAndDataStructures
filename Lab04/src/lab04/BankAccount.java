package lab04;

public class BankAccount {
    private String name;
    private int accNo;
    private double balance, loanAmount;

    public BankAccount(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void loanGenerator(double loanPrinciple, double loanRate, double loanTime) {
        this.loanAmount = loanPrinciple + loanPrinciple * loanRate * loanTime;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Boolean isArmstrong() {
        /*
        checks if the object's account number is an armstrong number, returns boolean
         */
        int accNo = this.accNo;
        int originalNumber = accNo;
        int remainder = 0;
        int result = 0;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        return result == accNo;
    }


}
