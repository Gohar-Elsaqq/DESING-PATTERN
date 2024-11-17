package factorymethod;

public class Fawry implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Fawry.");
    }
}
