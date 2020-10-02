import java.util.*;
import java.util.regex.Pattern;
public class Strong_Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String password=sc.nextLine();
		int re=minimumNumber(n,password);
		System.out.print(re);
     
	}
	 static int minimumNumber(int n, String password) {
	        // Return the minimum number of characters to make the password strong
	int count=4;
	Pattern uppercase = Pattern.compile("[A-Z]");
	Pattern lowercase = Pattern.compile("[a-z]");
	Pattern digit = Pattern.compile("[0–9]");
	Pattern special =Pattern.compile("[!@#$%^&*()-+]");
	if(uppercase.matcher(password).find()){
	count -- ;
	}
	if(lowercase.matcher(password).find()){
	count-- ;
	}
	if(digit.matcher(password).find()){
	count -- ;
	}
	if(special.matcher(password).find()){
	count -- ;
	}
	// Return the maximum number of characters to make the password strong
	int result = Math.max(count,6-n);
	return result;
	}

}


//int n=sc.nextInt();
//String str=sc.nextLine();
////String[] str1=new String[n];
////int length=str.length();
//int ok=0;
////String str="";
//char[] chlower = {'a','b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//char[] chupper = {'A','B', 'C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//char[] chnumber = {'1','2', '3','4','5','6','7','8','9','0'};
//@SuppressWarnings("unused")
//char[] chspcl = {'!','@','#','$','%','^','&','*','(',')','-','+'};
////for(int i=0;i<n;i++)
////	str1[i]=sc.nextLine();
////for(int i=0;i<n;i++)
////	str=str+str1[i];
////System.out.println(str);
////String str=new String(str1); 
//
//  for (int i = 0; i < str.length(); i++)
//  {
//      char ch =str.charAt(i);
//          for (int j = 0; j < chlower.length; j++) 
//          {
//             if (chlower[j] == ch)
//             {
//                ok=ok+1;
//                break;
//             }
//          }
//  }
//// ------------------------------------------------------------------------------ //	      
//  for (int i = 0; i < str.length(); i++)
//  {
//      char ch = str.charAt(i);
//      for (int j1 = 0; j1 < chupper.length; j1++) 
//      {
//         if (chupper[j1] == ch)
//         {
//            ok=ok+1;
//            break;
//         }
//      }
//  }
////--------- ------------------------------------------------------------------------------ //	      
//  for (int i = 0; i < str.length(); i++)
//  {
//      char ch = str.charAt(i);
//          for (int j = 0; j < chnumber.length; j++) 
//          {
//             if (chnumber[j] == ch)
//             {
//                ok=ok+1;
//                break;
//             }
//          }
//  }
////------------------------------------------------------------------------------ //	      
//  for (int i = 0; i < str.length(); i++)
//  {
//      char ch = str.charAt(i);
//          for (int j = 0; j < chspcl.length; j++) 
//          {
//             if (chspcl[j] == ch)
//             {
//                ok=ok+1;
//                break;
//             }
//          }
//  }
//  System.out.println(ok);
////------------------------------------------------------------------------------------------- //	
//  if(str.length()>6)
//	  System.out.println("YOU ADDED "+ (6-str.length()));
//  else if ( (str.length()<=6) && ok!=4)
//	  System.out.println("YOU ADDED "+ (4-ok));
//  else
//	System.out.println("OK");
//
//	
// 
//
