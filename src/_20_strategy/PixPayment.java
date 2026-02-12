package _20_strategy;

public class PixPayment implements PaymentStrategy {
    private String pixKey;
    
    public PixPayment(String pixKey) {
        this.pixKey = pixKey;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("📱 Pagando R$ " + amount + " via PIX (" + pixKey + ")");
    }
}
