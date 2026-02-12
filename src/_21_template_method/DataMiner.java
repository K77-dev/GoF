package _21_template_method;

/**
 * TEMPLATE METHOD - Padrão Comportamental
 * Define o esqueleto de um algoritmo, deixando subclasses redefinirem certas etapas.
 * 
 * Exemplo: Mineração de dados de diferentes fontes.
 */
public abstract class DataMiner {
    // Template method
    public final void mine() {
        openFile();
        extractData();
        parseData();
        closeFile();
    }
    
    protected abstract void openFile();
    protected abstract void extractData();
    
    // Métodos com implementação padrão
    protected void parseData() {
        System.out.println("🔄 Parseando dados...");
    }
    
    protected void closeFile() {
        System.out.println("🔒 Fechando arquivo\n");
    }
}
