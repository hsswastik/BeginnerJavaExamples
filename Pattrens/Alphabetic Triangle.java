// to print pattren
// ach alphabet is printed in a sequence, starting from 'a' and incrementing by one for each subsequent row
//    a
//    bc
//    cde
//    defg
//    efghi


//--------------------------------------------------------------------------

import java.util.Scanner;
class p28{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int row = sc.nextInt();
char c = 'a';
for(int i=1;i<=row;i++)
{
	char k = c;
	for(int j=1;j<=i;j++)
	{	
			System.out.print(k++);
	}
c++;
System.out.println();
}}}

