package builderpattern;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment.Builder()
                .method("Credit Card")
                .amount(150)
                .currency("USD")
                .build();

        System.out.println(payment);
    }
}