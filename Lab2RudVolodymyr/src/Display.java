import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Class <code>Display</code> implements display and AutoCloseable
 * @author Volodymyr Rud
 * @version 1.0
 */
public class Display implements AutoCloseable {
    //file to write
    private PrintWriter fout;

    /**
     * Constructor initializes file writter variable
     */
    Display() {
        try {
            fout = new PrintWriter(new File("DisplayFile.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method print in file and in console result of calculating of bar code
     * @param res, code
     */
    public void WriteBarCodeScanResult(boolean res, String code) {
        if (res) {
            System.out.println("Bar Code " + code + " scanned successfully");
            fout.println("Bar Code " + code + " scanned successfully");
            fout.flush();
        } else {
            System.out.println("Bar Code " + code + " is incorrect");
            fout.println("Bar Code " + code + " is incorrect");
            fout.flush();
        }
    }

    /**
     * Method closes the file
     */
    @Override
    public void close() throws Exception {
        if (fout != null) {
            fout.flush();
            fout.close();
        }
    }

    /**
     * Method prints that bar code is not recognized
     */
    public void noCodeRecognise() {
        System.out.println("No bar code is recognized");
        fout.println("No bar code is recognized");
        fout.flush();
    }
}
