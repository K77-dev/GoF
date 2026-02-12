package _14_command;

public class App {
    public static void main(String[] args) {
        System.out.println("=== COMMAND PATTERN ===\n");
        
        TextEditor editor = new TextEditor();
        CommandInvoker invoker = new CommandInvoker();
        
        invoker.executeCommand(new WriteCommand(editor, "Hello "));
        invoker.executeCommand(new WriteCommand(editor, "World!"));
        
        System.out.println("\n⏪ Desfazendo última ação:");
        invoker.undo();
        
        System.out.println("\n⏪ Desfazendo novamente:");
        invoker.undo();
    }
}
