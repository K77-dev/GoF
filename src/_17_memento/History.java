package _17_memento;

import java.util.Stack;

public class History {
    private Stack<EditorMemento> states = new Stack<>();
    
    public void push(EditorMemento memento) {
        states.push(memento);
    }
    
    public EditorMemento pop() {
        return states.isEmpty() ? null : states.pop();
    }
}
