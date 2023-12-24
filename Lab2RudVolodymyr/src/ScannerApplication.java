
/**
 * Bar Code Scanner Application class implements main method for BarCodeScanner
 class possibilities demonstration
 * @author Rud Volodymyr
 * @version 1.0
 */

public class ScannerApplication {
    public static void main(String[] args) {
        Display tablet = new Display();
        Camera codeReader = new Camera(1080);
        BarCodeScanner scannerBar = new BarCodeScanner(tablet, codeReader);
        scannerBar.ScanBarCode("036000291452");
        scannerBar.ScanBarCode("000001000000");
        scannerBar.ScanBarCode("036000291452");

    }
}