package factorymethod;

import java.util.HashMap;
import java.util.Map;

class PaymentFactory {
    private static final Map<String, Payment> paymentMethods = new HashMap<>();

    static {
        paymentMethods.put("CREDIT", new CreditCardPayment());
        paymentMethods.put("PAYPAL", new PayPalPayment());
        paymentMethods.put("Fawry",new Fawry());
    }

    public static Payment createPayment(String type) {
        return paymentMethods.get(type);
    }
}