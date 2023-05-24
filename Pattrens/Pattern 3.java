// to print number of *

//*****
//*@***
//*****
//*****
//****@

import java.util.Scanner;
class p6{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int row = sc.nextInt();
int col = sc.nextInt();
for(int i=1;i<=row;i++)
{
	for(int j=1;j<=col;j++)
	{
	if((i==2 && j==2)||(i==row && j==row))
		System.out.print("@");
	else
		System.out.print("*");
	}
System.out.println();
}}}
