import java.util.*;

public class Beautiful_Days_at_the_Movies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ex ob=new ex();
		int l=sc.nextInt();
		int u=sc.nextInt();
		int div=sc.nextInt();
		int c,d,count=0;
		for(int i=l;i<=u;i++)
		{
		 c=Math.abs(ob.ex(i)-i);
		
		 if (c%div==0)
			{
				count++;
			}
		}
		System.out.println(count);
	
	}
}
class ex{
	public int ex(int n)
	{
		int r,sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		return sum;
		
	}
}

