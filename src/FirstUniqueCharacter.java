import java.util.*;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String input = "suresh";
        System.out.println(getUniqueCharacter(input));
    }

    public static int getUniqueCharacter(String s) {
        String unique = "";
        for (int i = 0; i < s.length(); i++) {
            if (!unique.contains(Character.toString(s.charAt(i)))) {
                unique += Character.toString(s.charAt(i));
            }
        }
        List<Character> stringList = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            stringList.add(ch);
        }
        for (int i = 0; i < unique.length(); i++) {
            if (Collections.frequency(stringList, unique.charAt(i)) == 1) {
                return (i + 1);
            }

        }
        return -1;
    }
}