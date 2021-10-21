import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int k = 0; k < n; k++) {
			String str = sc.nextLine();
			String str1, str2;
			if (str.length() % 2 != 0)
				System.out.println("-1");
			else {
				int re = str.length() / 2;
				str1 = str.substring(0, re);
				str2 = str.substring(re);
				check(str1, str2);
			}
		}
		sc.close();
	}

	public static void check(String str1, String str2) {
		char[] array = str1.toCharArray();
		char[] array1 = str2.toCharArray();
		Arrays.sort(array);
		Arrays.sort(array1);

		boolean re = Arrays.equals(array, array1);
		if (re == true)
			System.out.println("0");
		else {
			int count = 0;
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array1.length; j++) {
					if (array[i] == array1[j]) {
						count += 1;
						array1[j] = 0;
						break;
					}
				}
			}
			System.out.println("final " + (array1.length - count));
		}
	}

}
