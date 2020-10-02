import java.util.*;
public class Designer_PDF_Viewer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub

		ArrayList <Integer> list=new ArrayList<Integer>();

		HashMap <Character,Integer > map=new HashMap<Character,Integer>();
		System.out.println("ENTR");
		for(int j=0;j<26;j++)
		{
			int val=sc.nextInt();
	        int value = 97+j;
	        char c = (char) value;
			map.put(c,val);
		}


		System.out.print("Enter a string: ");  
		String str= sc.next();
		int size=str.length();  
		for(int i=0;i<size;i++)
		{
			Character s=str.charAt(i);
			if(map.containsKey(s))
			{	
				Integer value = map.get(s);
				list.add(value);
			}
			else
				System.out.println("ERROR");
				
		}
  		int sum=Collections.max(list);
  		System.out.println("Result is--------"+sum*size);
	 }
}


