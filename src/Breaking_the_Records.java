import java.util.*;
public class Breaking_the_Records {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int b=a[0];
		int c=a[0];
		int max=0,min=0;
		for(int i=1;i<n;i++)
		{
			if(b<a[i])
			{
				b=a[i];
				max++;
			}
			if(c>a[i])
			{
				c=a[i];
				min++;
			}
		}
		System.out.print(max+" "+min);

	}

}
