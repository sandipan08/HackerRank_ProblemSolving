import java.util.*;
public class Sequence_Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{	
			int x=0,y = 0;
			for(int j=1;j<=n;j++)
			{
				if(a[i]==j)
				{
					x=a[i];
					System.out.println("______X_______"+x);
					for(int i1=0;i1<n;i1++)
					{
						if(x==a[i1])
							y=i1+1;
					}
					System.out.println("_____________"+y);
				
				}
				
			}
		
		}


	}

}
