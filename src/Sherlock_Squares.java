import java.util.*;
public class Sherlock_Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		int c;
		for(int i=0;i<test;i++)
		{
			int  count=0;
			//System.out.println("Enter the upper range");
			int upper=sc.nextInt();
			//System.out.println("Enter the lower range");
			int lower=sc.nextInt();
			for(int j=1;j<=upper/3;j++)
			{
				c=j*j;
				if((c>=lower) && (c<=upper))
				{
					count++;
				}
				else 
					count=count;
			
			}
			System.out.println(count);
		}
	
		

	}

}
