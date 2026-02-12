package _06_adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // Não faz nada
    }
    
    @Override
    public void playMp4(String fileName) {
        System.out.println("🎬 Tocando arquivo MP4: " + fileName);
    }
}
