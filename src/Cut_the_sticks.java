import java.util.*;
public class Cut_the_sticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		List<Integer> arr = new ArrayList<Integer>(); 
		List<Integer> arr1 = new ArrayList<Integer>(); 

		for(int i=0;i<size;i++)
		{
			arr.add(sc.nextInt());
		}
		boolean ans = arr.isEmpty();
		while(ans!=true)
		{
			System.out.println("SIZE="+arr.size());
			int small=Collections.min(arr);
			for(int i=0;i<arr.size();i++)
			{
				int j=arr.get(i)-small;
				arr.set(i,j);
			}
			//System.out.println("_______+++++________"+arr);
			//removeAll(arr,0);
			arr1=arr;
			for(int i=0;i<arr1.size();i++)
			{
				removeAll(arr,0);
			}
			ans = arr.isEmpty();
			//System.out.println("_______________"+arr);
		
		}
	}
	private static void removeAll(List<Integer> list, int element) 
	{
	    for (int i = 0; i < list.size(); i++) 
	    {
	        if (Objects.equals(element, list.get(i))) {
	            list.remove(i);
	        }
	    }
	   
	}
}

