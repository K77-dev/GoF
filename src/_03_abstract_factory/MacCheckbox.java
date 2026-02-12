package _03_abstract_factory;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("🍎 Renderizando checkbox estilo Mac");
    }
}
