package example;

public class Main {
    public static void main(String[] args) {

        System.out.println(isComeBack("RL"));
    }

    public static boolean isComeBack (String str) {
        //R R L U D R L

        int x = 0;
        int y = 0;

        if (str.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'R') {
                x++;
            } else if (str.charAt(i) == 'L') {
                x--;
            } else if ((str.charAt(i) == 'D')) {
                y--;
            } else {
                y++;
            }
        }
        return x == 0 && y == 0;


    }
}