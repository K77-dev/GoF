package _18_observer;

public class NewsSubscriber implements Observer {
    private String name;
    
    public NewsSubscriber(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String message) {
        System.out.println("📰 " + name + " recebeu: " + message);
    }
}
