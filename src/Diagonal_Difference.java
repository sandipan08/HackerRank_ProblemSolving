import java.util.*;
public class Diagonal_Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,row=n,colu=n,d1=0,d2=0;
		int a[][]=new int [n][n];
		for (i = 0; i < row;++i)
		{
			for (j = 0; j < colu; j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
//	    for (i = 0; i < row; i++)
//	    {  
//	    	for (j = 0; j < colu; j++)
//	    	{  
//                System.out.print(a[i][j]); 
//            }  
//            System.out.println();//new line  
//        } 
	      for (i = 0; i < n; i++) 
	        { 
	            for (j = 0; j < n; j++) 
	            { 
	                // finding sum of primary diagonal 
	                if (i == j) 
	                    d1 += a[i][j]; 
	       
	                // finding sum of secondary diagonal 
	                if (i == n - j - 1) 
	                    d2 += a[i][j]; 
	            } 
	        } 
	      System.out.print(Math.abs(d1-d2));

	}

}
