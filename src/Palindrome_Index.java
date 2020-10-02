import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			ArrayList<Integer>list=new ArrayList<Integer>();
			int size=sc.nextInt();
			for(int i1=0;i1<n;i1++)
			{
				list.add(sc.nextInt());
				
			}
			check(list);
				
		}
	}
	public static void check(ArrayList<Integer> arr)
	{
		 int x = 0;
	        int sum = 0;
	        for (int a : arr) {
	            sum += a;
	        }

	        for (int y : arr) {
	            if (2 * x == sum - y) {
	            	System.out.println("YES");	
	            }
	            x = x + y;
	        }
	        System.out.println("NO");	

	    }
	}

	

