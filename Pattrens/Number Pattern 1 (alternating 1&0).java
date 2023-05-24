//	10101
//	01010
//	10101	
//	01010
//	10101






//------------------------------------------------------
import java.util.Scanner;

class Checkerboard{
public static void main (String[] args){

Scanner sc=new Scanner(System.in);
int row = sc.nextInt();

for(int i=1;i<=row;i++)
{
	for(int j=1;j<=row;j++)
	{
		System.out.print((i+j+1)%2); //System.out.print((i+j+1)%2); to alternate 0 and 1
	}
System.out.println();
}}}