// to print pattren

//    a
//    12
//    abc
//    1234
//    abcde


//--------------------------------------------------------------------------

import java.util.Scanner;
class alphabetnumbertriangle{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int row = sc.nextInt();

for(int i=1;i<=row;i++)
{
	char k = 'a';
	for(int j=1;j<=i;j++)
	{
	
	if(i%2==1)	
			System.out.print(++k);
	else
			System.out.print(j);	
	}
System.out.println();
}}}

