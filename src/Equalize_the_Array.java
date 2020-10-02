import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Equalize_the_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int names[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			names[i]=sc.nextInt();
		}
		//int names[]= {3,3,2,1,3};//10,20,10,2,5,20,10,4,7,20,52,5,20
		check(names);
	}
	public static void check (int arr[])
	{
	    int [] fr = new int [arr.length];  
	    int visited = -1;  
	    
	    for(int i = 0; i < arr.length; i++)
	    {  
	        int count = 1;  
	        for(int j = i+1; j < arr.length; j++)
	        {  
	            if(arr[i] == arr[j]){  
	                count++;  
	                //To avoid counting same element again  
	                fr[j] = visited;  
	            }  
	        }  
	        if(fr[i] != visited)  
	            fr[i] = count;  
	    }
	    Arrays.sort(fr);
	    System.out.println("---------------------"+(arr.length-fr[arr.length-1])); 
//	    return (int) Collections.max(Arrays.asList(fr));
	    
//      System.out.println("---------------------");  
//      System.out.println(" Element | Frequency");  
//      System.out.println("---------------------");  
//      for(int i = 0; i < fr.length; i++)
//      {  
//          if(fr[i] != visited)  
//              System.out.println("    " + arr[i] + "    |    " + fr[i]);  
//      }  
//      System.out.println("---------------------");  
        
	}
}
