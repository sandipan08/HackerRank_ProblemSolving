import java.util.Scanner;

public class Cats_Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			int a = sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			position(a,b,c);
		}
	}
	public static void position(int a,int b,int c)
	{
		int re1=Math.abs(c-a);
		int re2=Math.abs(c-b);
		if(re1==re2)
			System.out.println("Mouse C");
		else if(re1>re2)
			System.out.println("Cat B");
		else
			System.out.println("Cat A");		
	}

}
