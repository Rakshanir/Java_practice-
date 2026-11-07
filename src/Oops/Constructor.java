package Oops;
class BankAccount {

    String accountHolder;
    int balance;
    BankAccount(String name, int amount) {
        accountHolder = name;
        balance = amount;
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class Constructor {

	public static void main(String[] args) {
		BankAccount b = new BankAccount("Rakshani", 10000);

        b.display();

	}

}
