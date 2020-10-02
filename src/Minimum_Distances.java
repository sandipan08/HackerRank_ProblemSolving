import java.util.*;
public class Minimum_Distances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		ArrayList <Integer> list= new ArrayList <Integer>();
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					int re = Math.abs(j-i);
					list.add(re);
				}
			}
		}
		if(list.isEmpty()== true )
			System.out.print("-1");
		else
			System.out.print(Collections.min(list));
			
		

	}

}
