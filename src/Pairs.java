import java.util.*;
public class Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int i1=i+1;i1<a.length;i1++)
			{
				int re=Math.abs(a[i]-a[i1]);
				if(re==k)
				{
				count++;
				System.out.println(a[i]+" "+a[i1]);	
				}
			}		
		}
		System.out.println(count);	
	}

}
