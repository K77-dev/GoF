package _06_adapter;

public class App {
    public static void main(String[] args) {
        System.out.println("=== ADAPTER PATTERN ===\n");
        
        AudioPlayer player = new AudioPlayer();
        
        player.play("mp3", "music.mp3");
        player.play("mp4", "video.mp4");
        player.play("vlc", "movie.vlc");
        player.play("avi", "film.avi");
    }
}
