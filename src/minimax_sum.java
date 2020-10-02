import java.util.Arrays;
import java.util.*;
public class minimax_sum {
  public static void main (String [] args) {
	  Scanner sc=new Scanner(System.in);
	  int a[]=new int[5];
	  int sum=0,sum1=0;
	  for (int i = 0; i <a.length; i++)
	  {
			a[i]=sc.nextInt();
	  }
	  Arrays.sort(a);
	  int i;

	  for (i =0;i<a.length-1;i++)
		  {
				sum1=sum1+a[i];
		  }
	 // System.out.println("Minimum Sum is "+sum1);
	  for (i = 1; i <a.length; i++)
	  {
			sum=sum+a[i];
	  }
	 // System.out.println("Maximum Sum is "+sum);
	  System.out.println(sum1+" "+sum);

  }
}