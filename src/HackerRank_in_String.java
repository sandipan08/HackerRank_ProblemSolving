
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HackerRank_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String str=sc.next();
			
			System.out.println(check(str));
		}
	}
	public static String check (String s)
	{
        String str = "hackerrank";
        if (s.length() < str.length()) 
            return "NO";
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) 
            {
                j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");
	}

}

