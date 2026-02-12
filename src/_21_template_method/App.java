package _21_template_method;

public class App {
    public static void main(String[] args) {
        System.out.println("=== TEMPLATE METHOD PATTERN ===\n");
        
        DataMiner csvMiner = new CSVDataMiner();
        csvMiner.mine();
        
        DataMiner pdfMiner = new PDFDataMiner();
        pdfMiner.mine();
    }
}
