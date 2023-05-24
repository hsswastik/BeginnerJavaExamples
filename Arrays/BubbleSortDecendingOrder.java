//Bubble sort decending order

import java.util.Scanner;

class BubbleSortDecendingOrder
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int size = sc.nextInt();
		System.out.print("Enter the Array:");
				int[] a = new int[size];

		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();

		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j-1] < a[j])
					a[j-1]=a[j]-a[j-1]+(a[j]=a[j-1]);
			}
		}
		System.out.print("Sorted List is: ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
