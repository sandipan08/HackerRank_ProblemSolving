
public class GFG_MergeItUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=65,k=17,flag=0;
		for(int i=1;i<=51;i++)
		{
			int y=i*2;
			if(y==k*6)
			{
				System.out.println((char)(ans+6));
				System.out.println((char)(y-32));
				flag=1;
			}
			if(flag==1)
				System.out.println((char)(ans+6));	
		}
		

	}

}
