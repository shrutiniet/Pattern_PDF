package Pattern_PDF;
import java.util.*;
public class Pattern_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		while(row<=n)
		{
			int i=1;
			while(i<=n)
			{
				System.out.print("* ");
				i++;
			}
			row++;
			System.out.println();
		}

	}

}
