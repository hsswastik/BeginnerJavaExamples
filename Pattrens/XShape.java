// to print number of *

//*   *
// * *
//  *
// * *
//*   *

import java.util.Scanner;
class XShape
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Rows: ");
		int row = sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
			if(i==j || (i+j==row+1))
				System.out.print("*");
			else
				System.out.print(" ");
			}
		System.out.println();
		}
	}
}
