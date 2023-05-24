// to print number of *
//
//* * *
// ***
//*****
// ***
//* * *

import java.util.Scanner;
class Dimond1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int row = sc.nextInt();
//int row = sc.nextInt();   this is to get custom row and column
//int col = sc.nextInt();
if(row%2==0){
	row=row+1;
}
for(int i=1;i<=row;i++)
{
	for(int j=1;j<=row;j++)
	{
	if(i==row/2+1 || j==row/2+1 || (i+j==row+1) || (i==j))
		System.out.print("*");
	else
		System.out.print(" ");
	}
System.out.println();
}}}
