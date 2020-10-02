import java.util.Scanner;

public class Beautiful_Binary_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		int len=str.length();
		String replaceString=str.replace("010","");
		int relen=replaceString.length();
		int result=len-relen;
		System.out.println(result/3);
//		String str="abgdhrmwfgdhzgdoh";
//		System.out.println(str.length());
//		String replaceString=str.replace("gdh","");
//		System.out.println(replaceString.length());
	}

}
