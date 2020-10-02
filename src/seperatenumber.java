import java.util.Arrays;
import java.util.Scanner;

public class seperatenumber {

	public static void main(String[] args) {//99100
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		String num=sc.nextLine();
		String t="";
		int flag=0;
		int count=0;
		char n[]=num.toCharArray();
			Arrays.sort(n);
		for(int i=0;i<n.length;i++) {
			if(n[i]=='0')
				count++;
			else
				t=t+n[i];
		}
		//if(count%2==0)
			//System.out.println("False");
		//else {
			if(t.contains("19"))
				System.out.println("True");
			else {
				int l1=t.length();
				for(int i=0;i<l1;i++) {
					if(i==0)
						continue;
					char c=t.charAt(i);
					if((Integer.parseInt(c+""))==((Integer.parseInt(t.charAt(i-1)+"")+1)) || (Integer.parseInt(c+""))==((Integer.parseInt(t.charAt(i-1)+""))))
							continue;
					else {
						System.out.println("False");
						flag=1;
						break;
					}
						
							
				}
				if(flag==0)
					System.out.println("true");
			}
		//}
	}
}
	

