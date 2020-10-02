import java.util.Scanner;

public class Bon_Appétit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int id=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int charge =sc.nextInt();
		int actual,sum=0;
		for(int i=0;i<n;i++)
		{
			if(i!=id)
			{
				sum=sum+a[i];
			}
			else
				continue;
		}
		actual= sum/2;
		if(actual==charge)
			System.out.print("Bon_Appétit");
		else
			System.out.print(charge-actual);
			
		

	}

}
