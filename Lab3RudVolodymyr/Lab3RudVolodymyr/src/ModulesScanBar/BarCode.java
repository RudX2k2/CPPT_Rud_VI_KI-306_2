package ModulesScanBar;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Class <code>ModulesScanBar.BarCode</code> implements bar code
 * @author Volodymyr Rud
 * @version 1.0
 */

public class BarCode {
    //array of digits of bar code
    private int[] barCode;

    /**
     * Constructor by default. initialize empty array
     */
    public BarCode() {
        barCode = new int[12];
    }

    /**
     *
     * @param barCode
     * Constuctor
     */
    public BarCode(int [] barCode) {
        setBarCode(barCode);
    }

    /**
     * Method returns array of numbers barCode
     * @return array of numbers barCode
     */
    public int[] getBarCode() {
        return barCode;
    }

    /**
     * Method that returns true or false if bar code is calculated correct
     * @param code
     * @return true or false if bar code is calculated correct
     */
    public boolean setBarCode(int[] code) {
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < 12; i++) {
            int digit = code[i];

            if ((i + 1) % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
        }

        int totalSum = sumOdd + (sumEven * 3);
        int calcResult = (10 - (totalSum % 10)) % 10;
        int checkDigit = code[11];

        if (calcResult == checkDigit) {
            this.barCode = Arrays.copyOf(code, 12);
            return true;
        } else
            return false;
    }
}
