// to print pattren

//    a
//    bc
//    def
//    ghij


//--------------------------------------------------------------------------


import java.util.Scanner;
class alphabettriangle{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int row = sc.nextInt();
char k = 'a';
//char k = sc.next().charAt(0);
for(int i=1;i<=row;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(k++);
		
	}
System.out.println();
}}}

