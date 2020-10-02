import java.lang.reflect.Array;
import java.util.*;
public class Sorting_Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a[]=new String[n];
		ArrayList<String>list=new ArrayList<String>();
		ArrayList<String>list1=new ArrayList<String>();
		ArrayList<Integer>numberOnly=new ArrayList<Integer>();
		ArrayList<String>newstr=new ArrayList<String>();
		HashMap <String,Integer> map = new HashMap<String,Integer>();    // INCOMLPLETE
		for(int i=0;i<n;i++)
		{
			list.add(sc.next());
		}
		for(int i=0;i<n;i++)
		{
			list1.add(list.get(i).replaceAll("[^0-9]", ""));
			newstr.add(list.get(i).replaceAll("[^A-Za-z]+", ""));
		}
		for(int i=0;i<n;i++)
		{
			numberOnly.add(Integer.parseInt(list1.get(i)));
		}
		Collections.sort(newstr);
	    Collections.sort(numberOnly,Collections.reverseOrder());
	    System.out.println(numberOnly);
		System.out.println(newstr);
	    for(int i=0;i<n;i++)
	    {
	    	int num=numberOnly.get(i);
	        String ch=newstr.get(i);
	        map.put(ch,num);
	        //System.out.println(map.put(ch,num));
	    }
	    for(Map.Entry m : map.entrySet())    
	        System.out.println(m.getKey()+" "+m.getValue()); 

	}
}
//String str="sdfvsdf68fsdfsf8999fsdf09";
//String numberOnly= str.replaceAll("[^0-9]", "");
//String newstr = str.replaceAll("[^A-Za-z]+", "");
//System.out.println(numberOnly);
//System.out.println(newstr);
//System.out.println(str);