import java.io.InputStream;
import java.util.*;
public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=str.replaceAll(" ","");
		//System.out.println("Input String Without Spaces : "+str1);
		int length=str1.length();
		double a=Math.sqrt(length);
		int i,j,k,n=0,fl=0,k1 = 0;
		int colu=(int) Math.ceil(a);
		int row=(int) Math.floor(a);
		System.out.println("Length : "+length);
		System.out.println("Col-: "+colu);
		System.out.println("ROW: "+	row);
		if(row*colu<length)
			row=row+1;
		char sum[][]=new char[row][colu];
		System.out.println("Col-: "+colu);
		System.out.println("ROW: "+	row);
	    for (i = 0; i < row;++i)
	    {
	        for (j = 0; j < colu; j++) 
	        {
	            if(i+j+fl>=length)
	            {
	            	sum[i][j]=0;
	            	break;
	            }
	            sum[i][j] =str1.charAt(i+j+fl);
	            k1=j;
	        }
			fl=fl+k1;
			System.out.println("f1 "+fl);
	    }
//	    for (i = 0; i < row; i++)
//	    {  
//	    	for (j = 0; j < colu; j++)
//	    	{  
//                System.out.print(sum[i][j]); 
//            }  
//            System.out.println();//new line  
//        } 
	    for (i = 0; i < colu; i++)
	    {  
	    	for (j = 0; j < row; j++)
	    	{  
	    		System.out.print(sum[j][i]); 
            }  
           System.out.print(" ");//new line  
	    }   
	}
}
