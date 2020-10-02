//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class time {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String input = "07:05:45 PM"; 
////		boolean isFound = input.indexOf("AM") !=-1? true: false; //true
////		System.out.println(isFound);
////		input p = input.parse(input);
//		
//	     DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
//	    //Desired format: 24 hour format: Change the pattern as per the need
//	    DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
//	    Date date = null;
//	    String output = null;
//		 try{
//	         //Converting the input String to Date
//	    	 date= df.parse(input);
//	         //Changing the format of date and storing it in String
//	    	 output = outputformat.format(date);
//	         //Displaying the date
//	    	 System.out.println(output);
//	      }
//		 catch(ParseException pe){
//	         pe.printStackTrace();
//	       }
//
//	}
//
//}
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class time {
   public static void main(String [] args) {
	   Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       String[] h=str.split(" ");
       for(int j=0;j<h.length;j++)
       {
    	   if(h[2]=="PM")
    	   {
    		   h[0].split(":");
    	   }
       }
//       for(String i:h)
//    	   System.out.println(i);
       

   }
}

//Scanner sc=new Scanner(System.in);
//SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
//SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ss a");
//String str=sc.nextLine();
//Date date = parseFormat.parse(str);
//System.out.println(displayFormat.format(date));