import java.util.*;
public class Halloween_Sale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int d=sc.nextInt();
		int m=sc.nextInt();
		int sa=sc.nextInt();
		int a,s,sum=0,count=0;
		while(sum<=sa)
		{
			count++;
			sum=sum+p;
			s=p-d;
			if(s>m)
				p=s;
			else
				p=m;
		}
		System.out.println(sum);
		System.out.print(count-1);
	}

}
