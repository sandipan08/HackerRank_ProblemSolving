import java.util.*;
public class Electronics_Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList <Integer> list=new ArrayList <Integer> ();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int u=sc.nextInt();
		int a[]=new int[k];
		int b[]=new int[u];
		for(int i=0;i<k;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<u;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<u;j++)
			{
				//list.add(a[i]+b[j]);
				if(a[i]+b[j]<=m)
					list.add(a[i]+b[j]);		
			}
		}

		if(true==list.isEmpty())
			System.out.print("-1");
		else
		{
			int max=Collections.max(list);
			System.out.println(max);
		}
	}

}
