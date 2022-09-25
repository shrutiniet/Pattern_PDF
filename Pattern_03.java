package Pattern_PDF;
import java.util.*;
public class Pattern_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		while(row<=n)
		{
			int i=row;
			while(n>=i)
			{
				System.out.print("* ");
				i++;
			}
			row++;
			System.out.println();
		}

	}

}
