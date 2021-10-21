/////// ERROR ///////

import java.util.Scanner;

public class Angry_Professor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int i, j;
		for (i = 0; i < test; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			for (j = 0; j < n; j++) {
				a[i] = sc.nextInt();
			}
			System.out.print(angry(a, k));
		}
		sc.close();
	}

	public static String angry(int a[], int k) {
		int i, count = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] <= 0) {
				count++;
			}
		}
		return ((count >= k) ? "NO" : "YES");

	}
}
