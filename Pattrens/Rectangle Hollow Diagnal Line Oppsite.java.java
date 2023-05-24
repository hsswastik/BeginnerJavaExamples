// to print number of *
//#***
//*#**
//**#*
//***#


import java.util.Scanner;
class RectangleHollowDiagnalLine{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int row = sc.nextInt();
int col = sc.nextInt();
if(row==col)
{
for(int i=1;i<=row;i++)
{
	for(int j=1;j<=col;j--)
	{
	if(i==j)
		System.out.print("#");
	else
		System.out.print("*");
	}
System.out.println();
}}
else
System.out.println("it should be equal number");
}}