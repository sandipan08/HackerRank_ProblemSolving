import java.util.*;
public class Mars_Exploration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=str.length();
		String b="";
		for(int i=0;i<n/3;i++)
		{
			String c="SOS";
			b=b+c;
		}
//		System.out.println(b);
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)!=b.charAt(i))
				count++;
		}
		System.out.println(count);
		
		

	}

}
