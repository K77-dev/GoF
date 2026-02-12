package _14_command;

public class TextEditor {
    private StringBuilder text = new StringBuilder();
    
    public void write(String words) {
        text.append(words);
        System.out.println("✍️ Texto: " + text);
    }
    
    public void delete(int length) {
        int start = Math.max(0, text.length() - length);
        text.delete(start, text.length());
        System.out.println("🗑️ Texto: " + text);
    }
    
    public String getText() {
        return text.toString();
    }
}
