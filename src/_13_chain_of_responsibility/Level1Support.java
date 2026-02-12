package _13_chain_of_responsibility;

public class Level1Support extends SupportHandler {
    @Override
    public void handleRequest(String issue, int level) {
        if (level <= 1) {
            System.out.println("👨‍💻 Nível 1: Resolvendo '" + issue + "'");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue, level);
        }
    }
}
