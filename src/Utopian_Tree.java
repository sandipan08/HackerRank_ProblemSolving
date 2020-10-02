import java.util.Scanner;



public class Utopian_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int j=0;j<n;j++)
		{
			a[j]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
//			try
//			{
			int initial_height=1;
			for(int j1=0;j1<=a[j];j1++)
			{

					if(j1==0)
					{
						initial_height=initial_height+0;	
					}
					else if(j1%2==0)
					{
						initial_height=initial_height+1;
					}
					else if(j1%2!=0)
					{
						initial_height=initial_height*2;
					}
				}
			System.out.println(initial_height);
	
			
		}
	}

		
}


