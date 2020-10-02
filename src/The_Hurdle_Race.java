import java.util.*;
public class The_Hurdle_Race {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int i;
		ArrayList<Integer>list=new ArrayList<Integer>();
		for(i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		int max=Collections.max(list);
		int re=max-k;
		//System.out.println(re);
		if(re>=0)
			System.out.println(re);
		else
			System.out.println("0");
			
		

	}

}
