package _07_bridge;

public class TV implements Device {
    private int volume = 30;
    
    @Override
    public void turnOn() {
        System.out.println("📺 TV ligada");
    }
    
    @Override
    public void turnOff() {
        System.out.println("📺 TV desligada");
    }
    
    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("📺 Volume da TV: " + volume);
    }
}
