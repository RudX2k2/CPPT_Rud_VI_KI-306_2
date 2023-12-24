import ModulesScanBar.Camera;
import ModulesScanBar.Display;

import java.util.List;

public class CopyPrinter extends ScanBar implements ShowInfoBarCodeScanners{
    private List<String> scannedBarCodes;

    public CopyPrinter(){
        super();
    }
    public CopyPrinter(Display display, Camera camera)
    {
        super(display, camera);
    }
    @Override
    public boolean ScanBarCode(String code) {
        if(super.ScanBarCode(code))
        {
            scannedBarCodes.add(code);
            display.WriteCopyPrinterScanBarCodeResult(true, code);
            return true;
        }
        else{
            display.WriteCopyPrinterScanBarCodeResult(false, code);
            return false;
        }
    }
    @Override
    public String GetInfo()
    {
        return "This is CopyPrinter class";
    }

}
