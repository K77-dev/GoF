package _06_adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("🎵 Tocando arquivo VLC: " + fileName);
    }
    
    @Override
    public void playMp4(String fileName) {
        // Não faz nada
    }
}
