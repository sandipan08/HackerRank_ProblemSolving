import java.util.Scanner;

public class Jumping_on_the_Clouds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int count=-1;
		for(int i=0;i<n; )
		{
		        if(i+2<n && a [i+2]==0  )
		        {
		            i++;    
		        }    
		        i++;
		        count++;    
		}
		System.out.print(count);
	}

}


