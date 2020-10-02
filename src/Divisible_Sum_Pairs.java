import java.util.Scanner;

public class Divisible_Sum_Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int b=a[i]+a[j];
				if(b==k)
				{
					count++;
					//System.out.println("("+i+"+"+j+")"+count);
				}
				else if(b%k==0)
				{
					count++;
					//System.out.println("("+i+"+"+j+")"+count);
				}
					
			}
		}
		System.out.print(count);

	}

}
