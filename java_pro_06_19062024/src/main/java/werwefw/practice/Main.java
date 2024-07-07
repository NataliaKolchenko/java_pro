package werwefw.practice;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int numStart = 185;
        int numEnd = 300;

        long start = System.currentTimeMillis();
        new Main().isSelfDividedMath(numStart, numEnd);
        long end = System.currentTimeMillis() - start;
        System.out.println("Time " + end);
        start = System.currentTimeMillis();
        new Main().isSelfDivPars(numStart, numEnd);
        end = System.currentTimeMillis() - start;
        System.out.println("Time " + end);

        System.out.println(new Main().isSelfDividedMath(numStart, numEnd));

    }

    public List<Integer> isSelfDividedMath(int numberStart, int numberEnd) {

        List<Integer> listNum = new ArrayList<>();
        if (numberStart < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        if (numberStart == 0) {
            throw new IllegalArgumentException("It is a zero");
        }
        if (numberEnd < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        if (numberEnd == 0) {
            throw new IllegalArgumentException("It is a zero");
        }
        if (numberStart > numberEnd) {
            throw new IllegalArgumentException("NumberStart is bigger NumberEnd");
        }

        for (int i = numberStart; i < numberEnd; i++) {
            boolean flag = true;
            int testnum = i;
            int division;

            while (testnum != 0) {
                division = testnum % 10;
                if (division != 0) {
                    if (i % division != 0) {
                        flag = false;
                        break;
                    }
                }
                testnum = testnum / 10;
            }
            if (flag) {
                listNum.add(i);
            }
        }
        return listNum;
    }

    List<Integer> isSelfDivPars(int numberStart, int numberEnd) {

        List<Integer> listNum = new ArrayList<>();
        if (numberStart < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        if (numberStart == 0) {
            throw new IllegalArgumentException("It is a zero");
        }
        if (numberEnd < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        if (numberEnd == 0) {
            throw new IllegalArgumentException("It is a zero");
        }
        if (numberStart > numberEnd) {
            throw new IllegalArgumentException("NumberStart is bigger NumberEnd");
        }
        boolean flag;
        for (int i = numberStart; i < numberEnd; i++) {
            String strNumber = String.valueOf(Math.abs(i));
            flag = true;
            for (int j = 0; j < strNumber.length(); j++) {
                int elem = Integer.parseInt(String.valueOf(strNumber.charAt(j)));
                if (elem == 0) {
                    continue;
                }

                if (i % elem != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                listNum.add(i);
            }
        }

        return listNum;
    }
}
