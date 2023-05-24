// Program to merge 2 array into a single array

import java.util.Scanner;

class MergeTwoArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of First array:");
		int size1 = sc.nextInt();


		System.out.print("Enter the Array:");
		System.out.print("Enter the size of Second array:");
		int size2 = sc.nextInt(); 
		int[] a = new int[size1];
		int[] b = new int[size2];
		int[] c = new int[size1+size2];
		int k = 0;

		System.out.print("Enter the First Array:");
		for(int i=0;i<size1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the Second Array:");
		for(int i=0;i<size2;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
				c[i]=a[i];		
			else
				c[i]=b[k++];
		}
		System.out.print("Merged Array is: ");
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+" ");  
		
	}
}
 