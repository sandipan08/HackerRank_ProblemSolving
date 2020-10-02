import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char a=str.charAt(i);
			if(Character.isUpperCase(a)==true)
				count++;
		}
		if(Character.isLowerCase(str.charAt(0))==true)
			count++;
		  System.out.print(count);
	}

}
