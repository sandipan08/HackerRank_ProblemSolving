import java.util.*;
public class Kangaroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int v1=sc.nextInt();
		int x2=sc.nextInt();
		int v2=sc.nextInt();
		if(v1==v2)
			 System.out.print("NO");
		else
		{
			int j=(x2-x1)%(v1-v2);
			if(v1>v2)
			{
				if(j==0)
					System.out.print("YES");
				else
					System.out.print("NO");
					
			}
			else
				System.out.print("NO");
		}
			

	}

}
