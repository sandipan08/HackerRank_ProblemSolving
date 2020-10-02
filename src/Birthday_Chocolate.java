import java.util.Scanner;

///////////////// ERROR  //////////////////////
public class Birthday_Chocolate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int d=sc.nextInt();
		int m=sc.nextInt();
		int count=0;
//		for(int i=0;i<n;i++)
//		{
//			if(a[i]==d && m==1)
//				count++;
//		}
		for(int i=0;i<n;i++)
		{
			int r=0;
			for(int j=0;j<m;j++)
			{
				if(i+j<n)
					r=r+a[i+j];
			}
			if(r==d)
				count++;
			//System.out.print(count);
		}
		System.out.print(count);

	}

}
