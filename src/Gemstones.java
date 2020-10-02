
import java.util.Scanner;

public class Gemstones {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
           for (int i = 0; i < n; i++)
           {
                 String str1=sc.next();
                 String str2=sc.next();
                 check(str1,str2);
           }
    }
    public static void check(String str1,String str2)
    {
        int count=0,c=0;
        for (int i = 0; i < str1.length(); i++)
        {
            char a=str1.charAt(i);
            for (int i2 = 0; i2 < str2.length(); i2++)
            {
            	if(a==str2.charAt(i2))
            	{
            		count+=1;
            		c=1;
            		break;
            		
            	}
            	if(c!=0)
            		break;
            }
//            if(containsChar(str2,a)==true)
//                count++;
        }
        System.out.println("COUNT "+count);
        if(count==0)
            System.out.println("NO");
        else
            System.out.println("YES");
            
    }
//    public static boolean containsChar(String s, char search) {
//        if (s.length() == 0)
//            return false;
//        else
//            return s.charAt(0) == search || containsChar(s.substring(1), search);
//    }

}