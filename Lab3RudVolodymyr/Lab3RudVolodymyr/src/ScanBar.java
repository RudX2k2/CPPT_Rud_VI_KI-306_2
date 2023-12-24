import ModulesScanBar.Camera;
import ModulesScanBar.Display;

public class ScanBar extends BarCodeScanner implements ShowInfoBarCodeScanners {

    public ScanBar()
    {
        super();
    }
    public ScanBar(Display display, Camera camera) {
        super(display,camera);
    }

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

    @Override
    public String GetInfo() {
        return "This is ScanBar class";
    }
}
