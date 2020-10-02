import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str="abcd";
		int len=str.length();
		String rev="";
		int a[]=new int[len];
		int b[]=new int[len];
		for(int i=0;i<str.length();i++)
		{
			a[i]=(int) str.charAt(i);
		}
		for(int i1=len-1;i1>=0;i1--)
		{
			rev=rev+str.charAt(i1);
		}
		for(int i=0;i<rev.length();i++)
		{
			b[i]=(int) rev.charAt(i);
		}
		for(int i: a)
			System.out.println(i);
		for(int i: b)
			System.out.println(i);
	}


}
