package _07_bridge;

public class Radio implements Device {
    private int volume = 20;
    
    @Override
    public void turnOn() {
        System.out.println("📻 Rádio ligado");
    }
    
    @Override
    public void turnOff() {
        System.out.println("📻 Rádio desligado");
    }
    
    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("📻 Volume do rádio: " + volume);
    }
}
