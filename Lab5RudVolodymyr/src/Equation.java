public class Equation {
    public double Calculate(double x) throws CalcException {
        //y=tg(x)/(sin(4x) – 2cos(x))
        double y, rad;
        rad = x * Math.PI / 180.0;

        try {

            y = Math.tan(x) / (Math.sin(4 * x) - 2 * Math.cos(x));

            // If the result is not a valid number or x is at a critical point, throw ArithmeticException
            if (Double.isNaN(y) || Double.isInfinite(y) || x == 90 || x == -90 || x == 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException ex) {
            // Handle the ArithmeticException and throw a higher-level CalcException with an explanation
            if (rad == Math.PI / 2.0 || rad == -Math.PI / 2.0) {
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            } else if (x == 0) {
                throw new CalcException("Exception reason: X = 0 so devide by zero");
            } else {
                throw new CalcException("Unknown reason of the exception during exception calculation");
            }
        }
        return y;
    }
}