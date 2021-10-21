import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int correctlyPlaced = 0;
        for (int i = 0; i < input.length(); i++) {
            int ascii = (int) input.charAt(i);
            if ((ascii - 96) == (i + 1)) {
                correctlyPlaced++;
            }
        }
        System.out.println(correctlyPlaced);
        sc.close();
    }
}