import java.util.*;
public class Modified_Kaprekar_Numbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner (System.in);
        int l=sc.nextInt();
        int u=sc.nextInt();
        ArrayList<Integer> list =new ArrayList<Integer> ();
//        int n=9;
//        check(n);
        for(int i=l;i<=u;i++)
        {
            list.add(check(i));    
        }
//        System.out.print(" INVALID RANGE "+list.contains(1));
        //System.out.print(" INVALID RANGE "+list);
        boolean k=list.contains(1);
        if(k==false)
            System.out.print("INVALID RANGE ");
            

    }
    public static int check (int n)
    {
        
        int sq=n*n;
        int c=0;
        int t=n,p=1,a,b;
        while(t>0)
        {
            p=p*10;
            t=t/10;
        }
        a=sq/p;
        b=sq%p;
        if(a+b==n)
        {
            System.out.print(n+" ");
            c=1;    
        }
        return c;
    }

}
