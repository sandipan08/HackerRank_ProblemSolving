import java.util.*;
public class Ice_Cream_Parlor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			int m=sc.nextInt();
			int n=sc.nextInt();
			int cost[]= new int[n];
			for(int i1=0;i1<n;i1++)
				cost[i1]=sc.nextInt();
			check(m,cost);	
		}
	}
	public static void check(int m,int a[]) 
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int i1=i+1;i1<n;i1++)
			{
				if(a[i]+a[i1]==m)
				{
					System.out.println((i+1)+" "+(i1+1));
				}		
			}
		}
	}

}
