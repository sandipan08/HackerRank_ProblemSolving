import java.util.*;
public class Find_Digits {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        int testcase=sc.nextInt();
        int a[]=new int[100];
        for(int i=0;i<testcase;i++)
        {
            a[i]=sc.nextInt() ;
        }
        for(int i=0;i<testcase;i++)
        {
            int count=0;
            int str=a[i];
            while (a[i] > 0) 
            {
                int r=a[i]%10;
                if(r==0)
                {
                    count=count;
                }
                else if(str%r==0)
                {
                    count=count+1;
                }
                    
                a[i]=a[i]/10;
            }
            System.out.println("RESULT"+count);
        }
    }

}

