import java.io.IOException;

public class CalcException extends ArithmeticException {
    public CalcException(){}
    public CalcException(String cause)
    {
        super(cause);
    }
}
