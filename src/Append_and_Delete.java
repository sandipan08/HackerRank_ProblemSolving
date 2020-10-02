import java.util.*;
public class Append_and_Delete {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner (System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int k=sc.nextInt();
        int a=str1.length();
        int b=str2.length();
        int count=0;
        for(int i=0;i<b;i++)
        {
            // for(int i1=0;i1<b;i1++)
            // {
                if(str1.charAt(i)==str2.charAt(i))
                {
                    count++;
                    System.out.println(str1.charAt(i) +" ------- "+ str2.charAt(i));
                }
                else 
                	break;
                
            // }
        }
        System.out.println(count);
        int re1=a-count;
        int re2=b-count;
        if(re1+re2==k)
            System.out.print("Yes");
        else
            System.out.print("No");
            
    }

}
