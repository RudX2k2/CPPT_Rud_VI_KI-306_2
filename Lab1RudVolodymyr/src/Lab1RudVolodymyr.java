import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.*;

/**
 * Клас Lab1 реалізує приклад програми до лабораторної роботи №1
 *
 * @author Rud Volodymyr
 * @version 1.0
 * @since version 1.0
 *
 */

public class Lab1RudVolodymyr {
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args
     * @throws FileNotFoundException
     *
     */
    public static void main(String[] args) throws FileNotFoundException {

        int matrixSize;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        System.out.print("Введіть розмір квадратної матриці(мінімум 5): ");
        matrixSize = in.nextInt();
        in.nextLine();


        if (matrixSize < 5) {
            System.out.println("Введений розмір матриці некоректний\n");
        } else {
            arr = new char[matrixSize][];
            for (int i = 0; i < matrixSize; i++) {
                if(i == 0 || i == matrixSize-1)
                    arr[i] = new char[matrixSize];
                else if(i == 1 || i == matrixSize-2)
                    arr[i] = new char[2];
                else
                    arr[i] = new char[matrixSize-2];
            }
            System.out.print("\nВведіть символ-заповнювач: ");
            filler = in.nextLine();
            exit:
            if (filler.length() == 1)
            {
                for (int i = 0; i < matrixSize; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        arr[i][j] = (char) filler.codePointAt(0);
                    }
                }
                    System.out.println();
            }
            else if (filler.isEmpty()) {
                System.out.print("\nНе введено символ заповнювач");
                break exit;
            } else {
                System.out.print("\nЗабагато символів заповнювачів");
                break exit;
            }

            int jOfArr = 0;
            for (int i = 0; i < matrixSize; i++)
            {
                for (int j = 0; j < matrixSize; j++)
                {
                    if ((i == 1 || i == matrixSize - 2) && (j >= 1 && j <= matrixSize - 2)) {
                        System.out.print("  ");
                        fout.print("  ");
                    }
                    else if ((j == 1 || j == matrixSize - 2) && (i >= 1 && i <= matrixSize - 2)) {
                        System.out.print("  ");
                        fout.print("  ");
                    }
                    else {
                        System.out.print(arr[i][jOfArr] + " ");
                        fout.print(arr[i][jOfArr] + " ");
                        jOfArr++;

                    }

                    jOfArr = 0;
                }
                System.out.println();
                fout.println();
            }
            fout.flush();
            fout.close();
        }
    }
}