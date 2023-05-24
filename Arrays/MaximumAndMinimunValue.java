// find the Maximum and Minimun value from the array

import java.util.Scanner;

class MaximumAndMinimunValue
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

		//max
		int max = a[0];
		int min = a[0];

		for (int i=1;i<a.length;i++){

			if(max<a[i])
				max=a[i];

			if(min>a[i])
				min=a[i];
			
		}
		System.out.println("Maximum value is: "+max);
		System.out.println("Minimum value is: "+min);

	}
}