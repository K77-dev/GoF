package _12_proxy;

public class RealImage implements Image {
    private String filename;
    
    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }
    
    private void loadFromDisk() {
        System.out.println("💾 Carregando imagem do disco: " + filename);
    }
    
    @Override
    public void display() {
        System.out.println("🖼️ Exibindo: " + filename);
    }
}
