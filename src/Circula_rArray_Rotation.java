import java.util.*;
public class Circula_rArray_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int m=sc.nextInt();
		int i;
		int a[]=new int[n];
		int b[]=new int[m];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		//int a[]= {10,52,30,4};
		rotate(a, k, b);

	}
	public static void rotate(int a[],int k,int b[])
	{
		for(int j=0;j<k;j++)
		{
			int temp=a[a.length-1];
			for(int i=a.length-1;i>=1;i--)
			{
				a[i]=a[i-1];		
			}
			a[0]=temp;
		}
		for(int j=0;j<b.length;j++)
		{
			int t=b[j];
			System.out.println(a[t]);
		}
		
//		for(int i:a)
//			System.out.println(i);
	}
}