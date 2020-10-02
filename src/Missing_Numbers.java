// Missing_Numbers
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Missing_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       ArrayList<Integer> list=new ArrayList<Integer>();
       ArrayList<Integer> brr_list=new ArrayList<Integer>();
       int n=sc.nextInt();
       int arr[] = new int[n];
       for (int i = 0; i < n; i++)
       {
    	     arr[i]=sc.nextInt(); 
       }
       //-----------------------//
       int m=sc.nextInt();
       int brr[]=new int[m];
       for (int j = 0; j < m; j++)
       {
    	   brr[j]=sc.nextInt();
       }   
       //-----------------------//
       for (int i = 0; i < n; i++)
       {
    	   for (int j = 0; j < m; j++)
    	   {
    		   if(arr[i]==brr[j])
    		   {
    			   //System.out.println(arr[i]+" "+brr[j]);
    			   list.add(brr[j]);
    			   break;
    		   }
    	   }
       }
       //// ADD brr to brr_list ////
       for (int j = 0; j < m; j++)
       {
    	   brr_list.add(brr[j]);
       }
       //// List elemnt gulo brr_list e present thkle remove krchi 
       for(int i=0;i<list.size();i++)
       {
           //System.out.println(list.get(i));
    	   brr_list.remove(list.get(i));
       }
       Collections.sort(brr_list); // For sorting the list
       for(int i=0;i<brr_list.size();i++)
       {
           System.out.print(brr_list.get(i)+" ");
       }
	}

}
