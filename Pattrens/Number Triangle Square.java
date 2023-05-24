//	1
//	4 9
//	16 25 36
//   49 64 81 100







//------------------------------------------------------
import java.util.Scanner;

class NumberSquareTriangle{
public static void main (String[] args){

Scanner sc=new Scanner(System.in);
int row = sc.nextInt();
int n1 = 0;
int n2 = 1;
for(int i=1;i<=row;i++)
{	
	for(int j=1;j<=i;j++)
	{		
		System.out.print(n1);
		
		

	}
	System.out.print(n1+" "+n2 );
		int n3=n1+n2;
		n1=n2;
		n2=n3;
System.out.println();
}}}

/*
class NumberSquareTriangle{
public static void main (String[] args){

Scanner sc=new Scanner(System.in);
int row = sc.nextInt();
int n1 = 0;
int n2 = 1;
int n3 = 1;
for(int i=1;i<=row;i++)
{	
	for(int j=1;j<=i;j++)
	{		
		System.out.print(n3+" ");
		n3=n1+n2;
		n1=n2;
		n2=n3;
	
	}
		
System.out.println();
}}}
*/