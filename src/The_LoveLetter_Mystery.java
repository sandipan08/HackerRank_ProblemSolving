import java.util.ArrayList;
import java.util.Scanner;

public class The_LoveLetter_Mystery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Character>list=new ArrayList<Character>();
		for(int i=0;i<n;i++)
		{
			String str=sc.next();
			check(str);
		}
	}
	public static void check(String str)
	{
		int i=0,j=str.length()-1;
		int step=0;
		while(i<j)
		{
			int re=(int) str.charAt(i);
			int re1=(int) str.charAt(j);
			step=step + Math.abs(re-re1); 
			i++;
			j--;
		}
			System.out.println(step);
		
		
	}

}
