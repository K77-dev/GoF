package _20_strategy;

public class App {
    public static void main(String[] args) {
        System.out.println("=== STRATEGY PATTERN ===\n");
        
        ShoppingCart cart = new ShoppingCart();
        
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012"));
        cart.checkout(100.0);
        
        cart.setPaymentStrategy(new PayPalPayment("user@email.com"));
        cart.checkout(50.0);
        
        cart.setPaymentStrategy(new PixPayment("123.456.789-00"));
        cart.checkout(75.0);
    }
}
