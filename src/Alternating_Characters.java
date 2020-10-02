import java.util.*;

public class Alternating_Characters {

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
		int count=0;
		char[] a= str.toCharArray();
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		
//		}
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
				count++;
		}
		System.out.println(count);
	}
}
