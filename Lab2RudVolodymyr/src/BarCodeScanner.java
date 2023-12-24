import java.util.ArrayList;
import java.util.List;


/**
 * Class <code>BarCodeScanner</code> implements bar code scanner
 * @author Volodymyr Rud
 * @version 1.0
 */

public class BarCodeScanner {
    private BarCode scannedBarCode;
    private final Display display;
    private final Camera camera;

    /**
     * Constructor
     */
    public BarCodeScanner()
    {
        scannedBarCode = new BarCode();
        display = new Display();
        camera = new Camera(360);
    }

    /**
     * Constructor
     * @param display
     * @param camera
     */
    public BarCodeScanner(Display display, Camera camera)
    {
        this.scannedBarCode = new BarCode();
        this.display = display;
        this.camera = camera;
    }

    /**
     * Method that returns scannedBarCode
     * @return scannedBarCode
     */
    public BarCode getScannedBarCode()
    {
        return scannedBarCode;
    }

    /**
     * Method that returns true if process of scanning bar code has executed without exceptions
     * @param code
     * @return true if process of scanning bar code has executed without exceptions
     */
    public boolean ScanBarCode(String code)
    {
        int[] temp = new int[12];
        if(camera.captureImage()) {
            if (code.length() != 12) {
                display.noCodeRecognise();
                return false;
            }
            for (int i = 0; i < 12; i++) {
                temp[i] = Character.getNumericValue(code.charAt(i));
            }
            scannedBarCode = new BarCode();
            if (!scannedBarCode.setBarCode(temp)) {
                display.WriteBarCodeScanResult(false, code);
                return false;
            }
            else{
                display.WriteBarCodeScanResult(true, code);
                return true;
            }

        }
        else {
            display.noCodeRecognise();
            return false;
        }
    }
}
