import java.util.HashSet;
import java.util.Scanner;

public class Beautiful_Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashSet<Integer> set=new HashSet();
		int n=sc.nextInt();
		int d=sc.nextInt();
		int a[]=new int[n];
		int count=0,i,k,j;
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n-2;i++)
		{

				if(a[i+1]-a[i]==d)
				{
					set.add(i);
					set.add(i+1);
					System.out.println("("+a[i+1]+"-"+a[i]+")");
					count++;
					try {
						if(a[i+2]-a[i+1]==d)
						{
							//System.out.println("("+a[i+2]+"-"+a[i+1]+"-"+a[i]+")");
							System.out.println(a[i+2]);
							count++;
						}
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}
			}
		//System.out.println(set);
	}

}
