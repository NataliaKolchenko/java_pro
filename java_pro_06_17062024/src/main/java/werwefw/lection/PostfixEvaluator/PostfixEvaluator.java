package werwefw.lection.PostfixEvaluator;

import java.util.Stack;

public class PostfixEvaluator {

    public static int evaluate(String expression) throws MyException {
        Stack<Integer> stack = new Stack<>();

        String[] tokens = expression.split(" ");


        int countNum = 0;
        int countChar = 0;

        for (String token : tokens) {
            if (isOperator(token)) {
                countChar++;
                int operand1 = stack.pop();

                int operand2 = stack.pop();

                int result = applyOperator(token, operand1, operand2);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
                countNum++;

            }
        }

        if (countChar != countNum-1 || countNum == 1) {
            throw new MyException("FAIL: Unexpected situation");
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int applyOperator(String operator, int operand1, int operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand2 / operand1;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
//        String expression = "10 2 + 3 * 4 /"; // Пример: (10 + 2) * 3 / 4
//        String expression = "5 7 2 + *"; // Пример: 5 * (7 + 2)
//        String expression = "4 5 6 * +"; // Пример: 4 + (5 * 6)
//        String expression = "3 5 /"; // Пример: 3 / 5
//        String expression = "3 "; // Пример: некорректный пример
        String expression = "35 5 / 6 7 *"; // Пример: некорректный пример
        int result = 0;
        try {
            result = evaluate(expression);
            System.out.println("Результат: " + result);
        } catch (MyException e) {
            System.out.println(e);
        }

    }

}

    class MyException extends Exception {
        public MyException (String msg) {
            super(msg);
        }
    }
