// to print number of *

//*****
//**  *
//* * *
//*  **
//*****

// add (i+j==row+1)) in place of (i==j) this to get line in another side

import java.util.Scanner;
class HollowRectangleDiagnalLine
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
			if(i==1 || i==row || j==1 || j==row || (i==j))
				System.out.print("*");
			else
				System.out.print(" ");
			}
		System.out.println();
		}
	}	
}
