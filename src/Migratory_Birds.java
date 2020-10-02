import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Migratory_Birds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Integer,Integer> map=new HashMap <Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int c : a)
		{
            if (map.containsKey(c)) { 
            	  
                // If char is present in charCountMap, 
                // incrementing it's count by 1 
                map.put(c, map.get(c) + 1); 
            } 
            else
            	map.put(c, 1); 
		}

            
            int max = Collections.max(map.values());
            if (max != 1) {
                for (Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue().equals(max)) {
                        System.out.println(entry.getKey());
                        break;
                    }
                }
            } else {
                System.out.println("0");
            }
        }
	
}
