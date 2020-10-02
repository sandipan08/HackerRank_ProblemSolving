import java.util.*;
public class Viral_Advertising {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int share=5;
		int like,Cumulative=0;
		for(int i=1;i<=n;i++)
		{
			like=share/2;
			share=like*3;
			//System.out.println("share"+share);
			Cumulative=Cumulative+like;
		}
		System.out.println("Cumulative"+Cumulative);
	}

}
