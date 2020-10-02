	import java.util.ArrayList;
	import java.util.Scanner;
	
	public class Funny_String {
	
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
			int len=str.length();
			String rev="";
			int a[]=new int[len];
			int b[]=new int[len];
			for(int i=0;i<str.length();i++) 
			{
				a[i]=(int) str.charAt(i);
			}
			for(int i1=len-1;i1>=0;i1--) // Reverse a string
			{
				rev=rev+str.charAt(i1);
			}
			for(int i=0;i<rev.length();i++)
			{
				b[i]=(int) rev.charAt(i);
			}
			if(true==array(a,b))
				System.out.println("Funny");
			else
				System.out.println("Not Funny");
		}
		public static boolean array (int a[],int b[] )
		{
			ArrayList<Integer>alist=new ArrayList<Integer>();
			ArrayList<Integer>blist=new ArrayList<Integer>();
			for(int i=0;i<a.length-1;i++)
			{
				alist.add(Math.abs(a[i]-a[i+1]));
			}
			for(int i=0;i<b.length-1;i++)
			{
				blist.add(Math.abs(b[i]-b[i+1]));
			}
			if(true==alist.equals(blist))
				return true;
			else
				return false;
			
		}
		
	}
