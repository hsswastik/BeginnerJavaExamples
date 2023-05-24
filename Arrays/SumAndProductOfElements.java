// Sum and Product of the array elements

import java.util.Scanner;

class SumAndProductOfElements{
	public static void main(String [] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int size = sc.nextInt();
		int[] array = new int[size];
		int sum = 0;
		int prod = 1;
		System.out.print("Enter the Array:");


		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}

		for(int j=0;j<array.length;j++)
		{
			sum = sum + array[j];
			prod = prod * array[j];
		}

		System.out.println("Sum is: "+sum);
		System.out.println("Product is: "+prod);
	  
	}
}