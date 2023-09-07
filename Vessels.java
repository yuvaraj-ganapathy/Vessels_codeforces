package Sep7;
import java.util.Scanner;
public class Vessels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		int t=ip.nextInt();
		while(t>0) {
			int x=ip.nextInt();
			int y=ip.nextInt();
			int z=ip.nextInt();
			int m=Math.abs(((x-y)/(2*z)));
			if(Math.abs((x-y)%(2*z))!=0)
				m++;
			System.out.println(m);
			t--;
		}

	}

}
