// to print number of *
//
//  *
//  *
//*****
//  *
//  *

import java.util.Scanner;
class plus{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int row = sc.nextInt();
//int col = sc.nextInt();
if(row%2==0){
	row=row+1;
}
for(int i=1;i<=row;i++)
{
	for(int j=1;j<=row;j++)
	{
	//if(i-1==row/2 || j-1==row/2)
	if(i==row/2+1 || j==row/2+1)
		System.out.print("*");
	else
		System.out.print(" ");
	}
System.out.println();
}}}
