package _06_adapter;

/**
 * ADAPTER - Padrão Estrutural
 * Permite que objetos com interfaces incompatíveis trabalhem juntos.
 * 
 * Exemplo: Adaptar diferentes formatos de áudio para um player comum.
 */
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
