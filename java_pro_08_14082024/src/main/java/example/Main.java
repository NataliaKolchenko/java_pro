package example;

public class Main {
    public static void main(String[] args) {


    }

    public double divide(double a, double b) {
        if (b == 0) {

            throw new MyDivideByZeroException(
                    ErrorMessage.DIVIDE_BY_ZERO
            );
        }
        return a / b;
    }


}



