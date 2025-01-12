package simplefactorypattern;

public class Main {
    public static void main(String[] args) {

        Payment payment1 = PaymentFactory.createPayment("CREDIT");
        payment1.pay(100);

        Payment payment2 = PaymentFactory.createPayment("PAYPAL");
        payment2.pay(200);

        Payment payment3 = PaymentFactory.createPayment("CASH");
        payment3.pay(50);
    }
}