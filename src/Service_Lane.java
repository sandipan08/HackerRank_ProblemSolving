import java.util.*;
public class Service_Lane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayList<Integer> list=new ArrayList<Integer> ();
		for(int i=0;i<t;i++)
		{
			int start=sc.nextInt();
			int end=sc.nextInt();
			for(int i1=start;i1<=end;i1++)
			{
				list.add(a[i1]);
			}
			
			//System.out.println(list);
			
			System.out.println(Collections.min(list));
			list.removeAll(list);
			
		}
	}

}
