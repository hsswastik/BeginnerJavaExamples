//	1
//	3 2
//	6 5 4
//  10 9 8 7







//------------------------------------------------------
import java.util.Scanner;

class NumberTriangle{
public static void main (String[] args){

Scanner sc=new Scanner(System.in);
int row = sc.nextInt();
int x = 0;

for(int i=1;i<=row;i++)
{
	x = x+i;
	int y = x;	
	for(int j=1;j<=i;j++)
	{
			
	System.out.print(y-- +" ");
	}
System.out.println();
}}}