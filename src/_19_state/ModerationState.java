package _19_state;

public class ModerationState implements State {
    @Override
    public void publish(Document document) {
        System.out.println("🔍 Moderação → Publicando documento");
        document.setState(new PublishedState());
    }
}
