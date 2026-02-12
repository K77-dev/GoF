package _07_bridge;

public class Remote {
    protected Device device;
    
    public Remote(Device device) {
        this.device = device;
    }
    
    public void togglePower() {
        System.out.println("🎛️ Controle: alternando energia");
        device.turnOn();
    }
    
    public void volumeUp() {
        System.out.println("🎛️ Controle: aumentando volume");
        device.setVolume(50);
    }
}
