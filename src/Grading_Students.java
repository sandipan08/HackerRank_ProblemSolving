import java.util.*;
public class Grading_Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int b=0,c=0;
		for(int i=0;i<n;i++) {
			if(a[i]%5==0)
			{
				System.out.println(a[i]);
				continue;
			}
			if(a[i]<38)
			{
				System.out.println(a[i]);
				continue;
			}
			else
			{
				b=a[i]/5;
	
				b=b+1;
			
				c=b*5;
			
				if(c-a[i]<3)
				{
					System.out.println(c);
				}
				else
					System.out.println(a[i]);
					
				
			}
		}

	}

}
