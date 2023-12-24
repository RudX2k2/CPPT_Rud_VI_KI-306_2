import java.io.*;
import java.util.Scanner;

public class WriteReadCalcRes {
    private double number;
    private double numberFromBinFile;
    private double numberFromTextFile;
    private double numberRandomFile;

    public double getNumberRandomFile() {
        return numberRandomFile;
    }

    public double getNumberFromBinFile() {
        return numberFromBinFile;
    }

    public double getNumberFromTextFile() {
        return numberFromTextFile;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public void WriteToFileTxt(String fName) throws FileNotFoundException {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f ",number);
        f.close();
    }
    public void ReadFromFileTxt(String fName)
    {
        try
        {
            File f = new File (fName);
            if (f.exists())
            {
                Scanner s = new Scanner(f);
                numberFromTextFile = s.nextDouble();
                s.close();
            }
            else
                throw new FileNotFoundException("File " + fName + "not found");
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    public void WriteToFileBin(String fName) throws IOException {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(number);
        f.close();
    }
    public void ReadFromFileBin(String fName) throws IOException {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        numberFromBinFile = f.readDouble();
        f.close();
    }
    public void WriteRandom(String fName) throws IOException{
        RandomAccessFile f = new RandomAccessFile(fName, "rw");
        f.writeDouble(number);
        f.close();
    }
    public void ReadRandom(String fName) throws IOException{
        RandomAccessFile f = new RandomAccessFile(fName, "r");
        numberRandomFile = f.readDouble();
        f.close();
    }
}
