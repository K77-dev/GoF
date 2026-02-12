package _20_strategy;

public class PayPalPayment implements PaymentStrategy {
    private String email;
    
    public PayPalPayment(String email) {
        this.email = email;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("💰 Pagando R$ " + amount + " via PayPal (" + email + ")");
    }
}
