package _19_state;

public class Document {
    private State state;
    
    public Document() {
        this.state = new DraftState();
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public void publish() {
        state.publish(this);
    }
}
