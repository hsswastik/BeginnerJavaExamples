// Program to sort the array in descending order

import java.util.Scanner;

class DescendingOrder{
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
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					a[i]=a[j]-a[i]+(a[j]=a[i]);
				}
			} 
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}