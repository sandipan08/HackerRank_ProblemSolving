import java.util.Scanner;

public class Day_Programmer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d;
		if(n==1918)
		{
			d=15;
			date(d,n);	
		}
		else if (n>=1700 && n<=1917)
		{
			if(n%4==0)
			{
				d=29;
				System.out.print("LOL");
				date(d,n);
			}
			else
			{
				d=28;
				System.out.print("LOLLLLLLL");
				date(d,n);
				
			}
		}
		else
		{
			if(check(n)==true)
			{
				d=29;
				System.out.print("KKKK");
				date(d,n);
			}
			else
			{
				d=28;
				System.out.print("PPPPPPPPPP");
				date(d,n);
			}
		}

	}
	public static boolean check (int year ) 
	{
		if((year % 400==0) || (year % 4==0) && (year % 100!=0))
		{
			return true ;
		}
		else 
			return false ;
	
	}
	public static void date (int d ,int n) 
	{
		int result = 0;
		result=31+d+31+30+31+30+31+31;
		//System.out.print(result);
		int a=256-result;
		System.out.print(a+".09."+n);
		
	
	}
}
