import java.util.*;
public class Sock_Merchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		//int arr[]={33,3,4,5};
		//int arr[]= {10 ,20 ,20 ,10 ,10 ,30 ,50, 10 ,20};
		A ob=new A();
		ob.calcualte(a);

	}
}
class A{
	
	public void calcualte(int arr[])
	{
		int b[]=new int [100];
		int count1 = 0;
		for(int i=0;i<b.length;i++)
		{
			b[i]=1;
		}
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					b[j]=0;
				}
			}
			if(b[i]!=0)
				b[i]=count;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(b[i]!=0)
			{
				//System.out.println("    " + arr[i] + "    |    " + b[i]); 
			
					count1=count1+b[i]/2;
					//System.out.println(" \n ");
					//System.out.println("RESULT IS "+count1);
			}
		}
		System.out.println("RESULT IS "+count1);
	}
}
