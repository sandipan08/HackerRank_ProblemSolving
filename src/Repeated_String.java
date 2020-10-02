import java.util.*;
public class Repeated_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Long n=sc.nextLong();
		String a=str;
		String f="";
		for(int i=0;i<n;i++)
			str=str+a;
		for(int i=0;i<n;i++)
		{
			char cg=str.charAt(i);
			f = f+ Character.toString(cg);
			
		}
		//System.out.print(f);
		//String f=str.substring(0, n);
		//System.out.println(f);
		Long count=(long) 0;
		for(int i=0;i<f.length();i++)
		{
			//System.out.println(f.charAt(i));
			char c=f.charAt(i);
			if(c=='a' || c=='A')
				count++;	
		}
		System.out.println("RESULT IS "+count);
	}

}
