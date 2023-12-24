import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        WriteReadCalcRes fWriteReader = new WriteReadCalcRes();
        int angle = 75;
        Equation equation = new Equation();

        try {
            double result = equation.Calculate(angle);
            System.out.println("Result: " + result);
            fWriteReader.setNumber(result);
            fWriteReader.WriteToFileTxt("resTxt.txt");
            fWriteReader.WriteToFileBin("resBin.bin");
        } catch (CalcException e) {
            System.err.println("Calculation Error: " + e.getMessage());
        }

        System.out.println("Write result and read from txt file");
        fWriteReader.ReadFromFileTxt("resTxt.txt");
        System.out.println("Result of reading txt file is : " + fWriteReader.getNumberFromTextFile());
        try {
            fWriteReader.ReadFromFileBin("resBin.bin");
        }
        catch (IOException ex)
        {
            System.out.println("Binary file doesn't find");
        }
        System.out.println("Result of reading bin file is : " + fWriteReader.getNumberFromTextFile());

        fWriteReader.WriteRandom("resRand.bin");
        fWriteReader.ReadRandom("resRand.bin");
        System.out.println("Result of reading random file is : " + fWriteReader.getNumberRandomFile());
    }
}