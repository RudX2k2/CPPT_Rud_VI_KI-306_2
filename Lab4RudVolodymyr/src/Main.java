public class Main {
    public static void main(String[] args) {
        int angle = 45;
        Equation equation = new Equation();

        try {
            double result = equation.Calculate(angle);
            System.out.println("Result: " + result);
        } catch (CalcException e) {
            System.err.println("Calculation Error: " + e.getMessage());
        }
    }
}