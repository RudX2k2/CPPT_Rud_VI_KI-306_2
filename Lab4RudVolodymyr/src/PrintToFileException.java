import java.io.FileNotFoundException;

public class PrintToFileException extends FileNotFoundException {
    PrintToFileException(){}
    public PrintToFileException(String cause) {super(cause);}
}
