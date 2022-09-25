package Pattern_PDF;
import java.util.Scanner;
public class Pattern_04 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int row=1;
	while(row<=n)
	{
		int spc=n-row;
		while(spc>=1)
		{
			System.out.print("  ");
			spc--;
		}
		int i=1;
		while(i<=row)
		{
			System.out.print("* ");
			i++;
		}
		System.out.println();
		row++;
	}
}
}
