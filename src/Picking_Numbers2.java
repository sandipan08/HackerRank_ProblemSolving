import java.util.*;
public class Picking_Numbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> b=new ArrayList<Integer>();
		int a[]=new int[n];
		appreance ob=new appreance();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		ob.check(a);
//		for(int i:a)  
//			System.out.println(i); 

	}

}


class appreance
{
	public static void check(int a[])
	{
		second ob=new second();
		int [] fr = new int [a.length];  
	        int visited = -1;  
	        
	        for(int i = 0; i < a.length; i++){  
	            int count = 1;  
	            for(int j = i+1; j < a.length; j++){  
	                if(a[i] == a[j]){  
	                    count++;  
	                    //To avoid counting same element again  
	                    fr[j] = visited;  
	                }  
	            }  
	            if(fr[i] != visited)  
	                fr[i] = count;  
	        }  
	        for(int i = 0; i < fr.length; i++) 
			{
				if(fr[i] != visited)  
				{
				
				}
					//System.out.println(a[i]+" "+fr[i]); 
							
			}
	        ob.check(fr);
	}
}


class second
{
	public static void check (int a[])
	{
		int first,second,i;
		if(a.length<2)
		{
			System.out.println(" Invalid Input ");
		}
		first=second=Integer.MIN_VALUE;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>first)
			{
				
				second=first;
				first=a[i];
			}
			else if (a[i]>second && a[i]!=first )
			{
				second=a[i];
				
			}
		}
//		 if (second == Integer.MIN_VALUE) 
//             System.out.print("There is no second largest"+ 
//                                 " element\n"); 
		 
//             System.out.print("The second largest element"+ 
//                                      " is "+ second);
		if(first-second!=0)
			System.out.println(first+second); 
	}
	 //System.out.println(first+"  "+second+" = "+(second+first));

}