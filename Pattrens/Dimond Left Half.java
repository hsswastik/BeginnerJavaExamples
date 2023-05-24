import java.util.Scanner;
class DimondLeftHalf{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int row = 3;//sc.nextInt();


for(int i=1;i<=row;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
System.out.println();
}

for(int i=row-1;i>0;i--)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
System.out.println();
}}}

