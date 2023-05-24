// to print Sywmbol
//    
//    *  ****
//    *  *
//    *  *
//    *******
//       *  *
//       *  *
//    ****  *

import java.util.Scanner;
class SwastikSymbol
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  the  number of Rows: ");
		int row = sc.nextInt();
		int mid = row/2+1;
		if(row%2==0){
			row=row+1;
		}
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
			if((i==mid || j==mid) || (j==1 && i<=mid) || (i==1 && j>=mid) || (j==row&&i>=mid) || (i==row&&j<=mid) )
				System.out.print("*");
			else
				System.out.print(" ");
			}
		System.out.println();
		}
	}
}
