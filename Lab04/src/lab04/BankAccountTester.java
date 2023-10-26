package lab04;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount bob = new BankAccount("Bob", 371, 4500);
        bob.loanGenerator(5000, 0.05, 3);
        System.out.println(bob.getName());
        bob.deposit(1000);
        System.out.println(bob.getBalance());
        bob.withdraw(4000);
        System.out.println(bob.getBalance());
        System.out.println(bob.getLoanAmount());

        System.out.println(bob.isArmstrong());
    }
}
