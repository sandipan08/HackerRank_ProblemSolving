import java.util.*;
public class Fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		if(i%3==0 && i%5==0)
		{
			System.out.println("FizzBuzz");
			continue;
		}	
		if(i%3==0)
		{
			System.out.println("Fizz");
			continue;
		}
		if(i%5==0)
		{
			System.out.println("Buzz");
			continue;
		}
		

		else
			System.out.println(i);
		}


	}

}


