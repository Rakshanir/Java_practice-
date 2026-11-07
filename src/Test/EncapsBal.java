package Test;

public class EncapsBal {
       private double balance;

    public void setBalance(double balance) {
        if (balance >0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

    	EncapsBal account = new EncapsBal();

        account.setBalance(5000);

        System.out.println("Balance: " + account.getBalance());

        account.setBalance(-500);

        System.out.println("Balance: " + account.getBalance());
    }
}

