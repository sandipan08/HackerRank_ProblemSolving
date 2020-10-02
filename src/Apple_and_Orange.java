import java.util.Scanner;

public class Apple_and_Orange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int t=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		int apple[]=new int[m];
		int orange[]=new int[n];
		for(int i=0;i<m;i++)
			apple[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			orange[i]=sc.nextInt();
		int count1=0,count2=0;
		for(int i=0;i<m;i++)
		{
			apple[i]=apple[i]+a;
		}
		for(int i=0;i<n;i++)
		{
			orange[i]=orange[i]+b;
		}
		for(int i=0;i<m;i++)
		{
			if(apple[i]>=s && t>=apple[i] )
				count1++;
		}
		for(int i=0;i<n;i++)
		{
		
			if(orange[i]>=s && t>=orange[i])
				count2++;
		}
		System.out.println(count1);
		System.out.println(count2);

	}

}
