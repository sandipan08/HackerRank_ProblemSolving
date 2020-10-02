import java.util.ArrayList;
import java.util.Scanner;

public class Two_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Character>list=new ArrayList<Character>();
		for(int i=0;i<n;i++)
		{
			String str1=sc.next();
			String str2=sc.next();
			check(str1,str2);
		}
	}

	public static void check(String str1,String str2)
	{
		
		char[] a= str1.toCharArray();
		char[] b= str2.toCharArray();
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		
//		}
//		for(int i=0;i<b.length;i++)
//		{
//			System.out.println(b[i]);
//		
//		}
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int i1=0;i1<b.length;i1++)
			{
				if(a[i]==b[i1])
				{
					count++;
					c=1;
					break;	
				}	
			}
			if(c!=0)
				break;
		}
		if(count!=0)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}

}
