package MyEasyLambdaExamples;

public class Ex1 {
    public static void main(String[] args) {
        Operations lambda = ((value1, value2) -> value1 + value2);
        System.out.println(lambda.getResult(3,5));

        Printable printer =  str -> System.out.println(str);
        printer.print("Hey");

        Factorial f = value -> {
            int result = 1;
            for (int i = 1; i <= value; i++ ){
                result *= i;
            }
            return result;
        };

        System.out.println(f.getResultFactorial(5));
    }
}

