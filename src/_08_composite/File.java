package _08_composite;

public class File implements FileSystemComponent {
    private String name;
    private long size;
    
    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }
    
    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "📄 " + name + " (" + size + " KB)");
    }
}
