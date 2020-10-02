import java.math.BigInteger;

public class Extra_Long_Factorials {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int n=25;
		BigInteger f = new BigInteger("1");
		for(int i=2;i<=n;i++)
		{

			f = f.multiply(BigInteger.valueOf(i)); 
			//System.out.println("-------------"+i);
		}
		System.out.println(f);

	}

}
