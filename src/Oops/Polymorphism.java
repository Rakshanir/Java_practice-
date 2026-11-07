package Oops;
class Payment {
    void pay() {
        System.out.println("Payment processing");
    }
}

class UpiPayment extends Payment {
    void pay() {
        System.out.println("Payment through UPI");
    }
}

class CardPayment extends Payment {
    void pay() {
        System.out.println("Payment through Card");
    }
}

public class Polymorphism {

	public static void main(String[] args) {
		 Payment p;

	        p = new UpiPayment();
	        p.pay();

	        p = new CardPayment();
	        p.pay();

	}

}
