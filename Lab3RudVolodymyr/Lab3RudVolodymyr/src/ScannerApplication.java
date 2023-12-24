import ModulesScanBar.BarCode;
import ModulesScanBar.Camera;
import ModulesScanBar.Display;

/**
 * Bar Code Scanner Application class implements main method for BarCodeScanner
 class possibilities demonstration
 * @author Rud Volodymyr
 * @version 1.0
 */

public class ScannerApplication {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Display d1 = new Display();
        Camera c1 = new Camera(1000);
        ScanBar barScanner1 = new ScanBar(d1,c1);
        CopyPrinter copyPrinter1 = new CopyPrinter(d1,c1);
        barScanner1.ScanBarCode("123456789015");
        barScanner1.ScanBarCode("987654321030");
        barScanner1.ScanBarCode("000000000000");

        System.out.println();

        copyPrinter1.ScanBarCode("123456789015");
        copyPrinter1.ScanBarCode("987654321030");
        barScanner1.ScanBarCode("000000000000");

        System.out.println(barScanner1.GetInfo());
        System.out.println(copyPrinter1.GetInfo());


    }
}