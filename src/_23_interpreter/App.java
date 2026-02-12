package _23_interpreter;

public class App {
    public static void main(String[] args) {
        System.out.println("=== INTERPRETER PATTERN ===\n");
        
        // Expressão: (10 + 5) - 3
        Expression expr = new SubtractExpression(
            new AddExpression(
                new NumberExpression(10),
                new NumberExpression(5)
            ),
            new NumberExpression(3)
        );
        
        System.out.println("🧮 (10 + 5) - 3 = " + expr.interpret());
    }
}
