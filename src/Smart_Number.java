import java.util.*;
public class Smart_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.print(check(n));
	}
	public static boolean check(int n)
	{   int count=0;
        for(int i = 1; i <= n; i++) 
        {
            if (n % i == 0) 
            {
             
				count++;
            }
       }
        if(count%2==0)
        	return false;
        else
        	return true;
		
	}
	

}
