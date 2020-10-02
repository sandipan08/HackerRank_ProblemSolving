import java.util.Scanner;

public class Taum_Bday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			long b = sc.nextInt();
			long w=sc.nextInt();
			long bc=sc.nextInt();
			long wc=sc.nextInt();
			long z=sc.nextInt();
			bday(b,w,bc,wc,z);
		}
	}
	public static void bday(long b,long w,long bc,long wc,long z)
	{
		if(bc==wc)
			System.out.println((bc*b)+(wc*w));
//		else if(bc+z==wc+z)
//			System.out.println((bc*b)+(wc*w));
		else if(bc+z<wc)
		{
			long re=(bc+z)*w;
			System.out.println((bc*b)+re);
		}
		else if(wc+z<bc)
		{
			long re=(wc+z)*b;
			System.out.println(re+(wc*w));
		}	
		else
			System.out.println((bc*b)+(wc*w));
			
	}

}

