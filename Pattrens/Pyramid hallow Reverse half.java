// to print Sywmbol

//    *****
//     *  *
//      * *
//       **
//        *

//--------------------------------------------------------------------------

import java.util.Scanner;

class ReversehalfPyramid{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int row = 5;//sc.nextInt();

for(int i=1;i<=row;i++)
{
	for(int j=1;j<=row/2;j++)
	{
		
			System.out.print("*");

		
	}
	System.out.println();		
}}}

/*class p23{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int row = 5;//sc.nextInt();

for(int i=1;i<=row;i++)
{
	for(int j=1;j<=row;j++)
	{
		if(i==j || i==1 || j==row)
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.println();		
}}}
*/

