import java.util.*;
public class Little_Shino_and_Common_factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int count=0;
		for(int i=1;i<=b/2;i++ )
		{
		
				
			if(a%i==0 && b%i==0)
			{
				count++;
			}
		}
		System.out.print(count);
		

	}

}
