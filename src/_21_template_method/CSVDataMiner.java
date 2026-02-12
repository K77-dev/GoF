package _21_template_method;

public class CSVDataMiner extends DataMiner {
    @Override
    protected void openFile() {
        System.out.println("📄 Abrindo arquivo CSV");
    }
    
    @Override
    protected void extractData() {
        System.out.println("📊 Extraindo dados do CSV");
    }
}
