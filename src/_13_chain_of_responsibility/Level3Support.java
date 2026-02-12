package _13_chain_of_responsibility;

public class Level3Support extends SupportHandler {
    @Override
    public void handleRequest(String issue, int level) {
        if (level >= 3) {
            System.out.println("👨‍💼 Nível 3 (Gerente): Resolvendo '" + issue + "'");
        }
    }
}
