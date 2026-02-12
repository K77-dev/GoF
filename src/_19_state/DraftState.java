package _19_state;

public class DraftState implements State {
    @Override
    public void publish(Document document) {
        System.out.println("📝 Rascunho → Enviando para moderação");
        document.setState(new ModerationState());
    }
}
