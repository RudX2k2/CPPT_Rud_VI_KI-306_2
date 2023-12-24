import ModulesScanBar.BarCode;
import ModulesScanBar.Camera;
import ModulesScanBar.Display;


/**
 * Class <code>BarCodeScanner</code> implements bar code scanner
 * @author Volodymyr Rud
 * @version 2.0
 */

public abstract class BarCodeScanner{
    protected BarCode scannedBarCode;
    protected final Display display;
    protected final Camera camera;

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
    public abstract boolean ScanBarCode(String code);
}
