import java.util.*;
public class Counting_Valleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//String[] str=new String[n];
		String str=sc.next();
		int alt=0,count=0;
//		for(int i=0;i<n;i++)
//			str[i]=sc.nextLine();
		for(int i=0;i<n;i++)
		{
			char ch=str.charAt(i);
			if(ch=='U')
			{
				alt++;
				if(alt==0)
					count++;
			}
			else
				alt--;
		}
		System.out.println(count);
	}

}
//UDDDUDUU