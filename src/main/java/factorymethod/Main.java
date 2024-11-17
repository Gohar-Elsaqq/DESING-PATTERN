package factorymethod;

public class Main {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.createPayment("Fawry");
        if (payment != null) {
            payment.pay(90);
        } else {
            System.out.println("Invalid payment type.");
        }

//        Payment paypalPayment = PaymentFactory.createPayment("PAYPAL");
//        if (paypalPayment != null) {
//            paypalPayment.pay(200);
//        } else {
//            System.out.println("Invalid payment type.");
//        }
    }
}