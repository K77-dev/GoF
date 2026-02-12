package _13_chain_of_responsibility;

public class Level2Support extends SupportHandler {
    @Override
    public void handleRequest(String issue, int level) {
        if (level == 2) {
            System.out.println("👨‍🔧 Nível 2: Resolvendo '" + issue + "'");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue, level);
        }
    }
}
