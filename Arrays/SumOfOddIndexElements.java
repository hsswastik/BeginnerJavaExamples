// Print sum of odd elements in the ARRAY
// index value starts with 0 but we start counting from 1
// so index 0 is our first

import java.util.Scanner;

class SumOfOddIndexElements
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int size = sc.nextInt();
		System.out.print("Enter the Array:");
		int[] array = new int[size];
		int sum = 0;


		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}

		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2!=0)
			{
				sum+=array[i];		
			}
		}
		System.out.println("Sum of Odd index Elements is: "+sum);
	}
}
		
 