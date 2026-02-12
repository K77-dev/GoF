package _07_bridge;

/**
 * BRIDGE - Padrão Estrutural
 * Separa uma abstração de sua implementação para que ambas possam variar independentemente.
 * 
 * Exemplo: Controles remotos que funcionam com diferentes dispositivos.
 */
public interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
