package _16_mediator;

public class App {
    public static void main(String[] args) {
        System.out.println("=== MEDIATOR PATTERN ===\n");
        
        ChatMediator chatRoom = new ChatRoom();
        
        User alice = new User("Alice", chatRoom);
        User bob = new User("Bob", chatRoom);
        User charlie = new User("Charlie", chatRoom);
        
        chatRoom.addUser(alice);
        chatRoom.addUser(bob);
        chatRoom.addUser(charlie);
        
        alice.send("Olá pessoal!");
        System.out.println();
        bob.send("Oi Alice!");
    }
}
