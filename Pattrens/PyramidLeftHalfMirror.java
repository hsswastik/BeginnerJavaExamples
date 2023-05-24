// to print Sywmbol
//  
//  *****
//   ****
//    ***
//     **
//      * 
  



//--------------------------------------------------------------------------

import java.util.Scanner;
class PyramidLeftHalfMirror
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Rows: ");
		int row = sc.nextInt();

		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=row;j++)
			{
				if(j<=(row-i))
					System.out.print(" ");
				else
					System.out.print("*");
			}
		System.out.println();
		}
	}
}
