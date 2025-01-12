package simplefactorypattern;

class PaymentFactory {
    public static Payment createPayment(String type) {
        switch (type.toUpperCase()) {
            case "CREDIT":
                return new CreditCardPayment();
            case "PAYPAL":
                return new PayPalPayment();
            case "CASH":
                return new CashPayment();
            default:
                throw new IllegalArgumentException("Invalid payment type: " + type);
        }
    }
}