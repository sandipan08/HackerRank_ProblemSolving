import java.util.Arrays;
import java.util.Scanner;

public class Making_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
        String str2=sc.next();
        check(str1,str2);

	}
	  public static void check(String str1,String str2)
	  {
			char[] array= str1.toCharArray();
			char[] array1= str2.toCharArray();
//			for(int i=0;i<array.length;i++)
//				System.out.println(array[i]);
			Arrays.sort(array);
			Arrays.sort(array1);
			boolean re=Arrays.equals(array, array1);
			if(re==true)
				System.out.println("0");
			else
			{
				int count=0;
				for(int i=0;i<array.length;i++)
				{
					for (int j = 0; j < array1.length; j++)
					{
						if(array[i]==array1[j])
						{
							count+=1;
							array1[j]=0;
							break;
						}
					}
				}
				System.out.println("count "+count);
				int final1=(array1.length-count)+(array.length-count);
				System.out.println("final "+final1);
			}
			
	  }

}
