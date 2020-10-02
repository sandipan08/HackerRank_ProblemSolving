
import java.util.*;
class Iman_StringMini{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String:");
String str=sc.nextLine();
int l=str.length();
String b="";
String t="";
//String final;
for(int i=l-1;i>=0;i--)
{
    b=b+str.charAt(i);
}
String cp=b;
if(str.equalsIgnoreCase(b))
    System.out.println("Palindrom String"); 
else
{
    System.out.println("Not a palindrome");
    //str=str+b;
    for(int i=0;i<l;i++)
{
    t=t+str.charAt(i);
    b=t+b;
    boolean res=isPallin(b);
    if(res==true){
        System.out.println(b);
        break;
    }
    else
        b=cp;
  }
}

}

public static boolean isPallin(String s){
int l=s.length();
String t="";
for(int i=0;i<l;i++){
    char c=s.charAt(i);
    t=c+t;
}
if(t.equals(s))
    return true;
else return false;
}
}