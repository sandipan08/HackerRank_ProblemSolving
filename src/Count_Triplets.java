import java.util.Scanner;

public class Count_Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int r2=r*r;
		int count=0;
		for(int i=0;i<n;i++)
		{
			boolean result =check( a ,(a[i]*r),(a[i]*r2) );
			if(result==true)
				count++;
		}
		System.out.println(count);	

	}
    public static boolean check(int[] arr, int ar,int ar2) 
    { 
        int c=0;
        System.out.println(ar+" "+ar2);
        for(int i=0;i<arr.length;i++)
        { 
            if (arr[i] == ar) 
            { 
            	c=c+1;
            	System.out.println("YES");
            	break;
            } 
        }
        for(int i=0;i<arr.length;i++)
        { 
                if (arr[i] == ar2) 
                { 
                	c=c+1;
                	System.out.println("YES 2");
                	break;	
                }
        }
        if(c==2)
        	return true;
        else
        	return false;
    } 

}
