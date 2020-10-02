
public class String_Subsequence_AUTORABIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZZ";
		String b="";
		for(int i=0;i<str.length();i++)
		{
			b=""+str.charAt(i);
			for(int j=i+1;j<str.length();j++)
			{
				int ascii=str.charAt(i);
				int asciij=str.charAt(j);
				if(ascii+1==asciij)
				{
//					char k=str.charAt(i);
//					char l=str.charAt(j);
//					String b="k+l";
					b=b+str.charAt(j);	
				}
			}
			System.out.println(b);
		}

	}

}
