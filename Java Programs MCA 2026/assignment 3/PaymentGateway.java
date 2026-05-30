interface UPIPayment {
    void payViaUPI(double amount);
}

interface CardPayment {
    void payViaCard(double amount);
}

class OnlinePayment implements UPIPayment, CardPayment {

    public void payViaUPI(double amount) {
        System.out.println("UPI Payment Successful");
        System.out.println("Amount: ₹" + amount);
    }

    public void payViaCard(double amount) {
        System.out.println("Card Payment Successful");
        System.out.println("Amount: ₹" + amount);
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        try {
            OnlinePayment payment = new OnlinePayment();

            payment.payViaUPI(5000);
            payment.payViaCard(3000);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}