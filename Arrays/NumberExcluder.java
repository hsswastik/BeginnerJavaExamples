// //an array except the given number


import java.util.Scanner;


class NumberExcluder{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
//int n = sc.nextInt();
int n=20;
int[] a = new int[n-1];
for(int i=1;i<=20;i++)
{
	for(int j=0;j<a.length;j++)
	{	
		if(a[j]==i)
			System.out.print(a[i]+" ");
	}
}
}}

