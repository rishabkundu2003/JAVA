abstract class Payment {
    String transactionId;
    double amount;

    Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    abstract void processPayment();
}

class CreditCardPayment extends Payment {

    CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    void processPayment() {
        double total = amount + (amount * 0.02);
        System.out.println("Credit Card Payment");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Total Amount: " + total);
    }
}

class PayPalPayment extends Payment {

    PayPalPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    void processPayment() {
        double total = amount + (amount * 0.03);
        System.out.println("PayPal Payment");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Total Amount: " + total);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        try {
            Payment p1 = new CreditCardPayment("CC101", 1000);
            Payment p2 = new PayPalPayment("PP202", 1000);

            p1.processPayment();
            p2.processPayment();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}