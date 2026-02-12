package _19_state;

public class PublishedState implements State {
    @Override
    public void publish(Document document) {
        System.out.println("✅ Documento já está publicado!");
    }
}
