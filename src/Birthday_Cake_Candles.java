
import java.util.*;
public class Birthday_Cake_Candles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		int large=a[0];
		for(int i=1;i<n;i++)
		{
			if(large<a[i])
				large=a[i];
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(large==a[i])
				count++;

		}
		System.out.println(count);
		
	}

}
