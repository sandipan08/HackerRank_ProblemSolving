import java.util.*;

public class Alternating_Characters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			check(str);
		}
		sc.close();
	}

	public static void check(String str) {
		int count = 0;
		char[] a = str.toCharArray();

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1])
				count++;
		}
		System.out.println(count);
	}
}
