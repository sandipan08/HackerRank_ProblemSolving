import java.util.Scanner;

public class Drawing_Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int tp=sc.nextInt();
		int p=sc.nextInt();
		int turn = 0,back = 0;
		for(int i=1;i<=tp/2;i++)
		{
			turn=p/2;
		}
		back=tp/2-turn;
		System.out.println (Math.min(back,turn));

	}

}
