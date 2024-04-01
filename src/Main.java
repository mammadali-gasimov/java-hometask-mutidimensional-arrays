import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] s = new String[9];
        String[][] stars = new String[5][s.length];
        for (int i = 0; i < s.length; i++) {
            s[i] = " ";
        }

        int startIndex = s.length / 2;
        int leftIndex = startIndex - 1;
        int rightIndex = startIndex + 1;

        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j += 2) {
                if (i == 0) {
                    s[startIndex] = "*";
                } else {
                    s[leftIndex] = "*";
                    s[rightIndex] = "*";
                }
            }

            if (leftIndex > 0 && i != 0) {
                leftIndex--;
                rightIndex++;
            }


            for (int j = 0; j < s.length; j++) {
                System.out.print(s[j]);
            }
            System.out.println();
        }
    }
}