// to print Sywmbol

//  *********
//   *******
//    *****
//     ***
//      *
 
  



//--------------------------------------------------------------------------

import java.util.Scanner;
class ReversePyramid{
public static void main(String[] args) throws InterruptedException{
Scanner sc = new Scanner(System.in);
int row = sc.nextInt();

for(int i=row;i>=1;i--)
{
	for(int j=1;j<=row-i;j++)
		System.out.print(" ");

	for(int j=1;j<=(i*2)-1;j++)
	{
		Thread.sleep(5);
		System.out.print("*");
	}
	System.out.println();		
}}}
