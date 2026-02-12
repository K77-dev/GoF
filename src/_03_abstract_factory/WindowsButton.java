package _03_abstract_factory;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("🪟 Renderizando botão estilo Windows");
    }
}
