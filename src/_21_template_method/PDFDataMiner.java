package _21_template_method;

public class PDFDataMiner extends DataMiner {
    @Override
    protected void openFile() {
        System.out.println("📕 Abrindo arquivo PDF");
    }
    
    @Override
    protected void extractData() {
        System.out.println("📄 Extraindo texto do PDF");
    }
}
