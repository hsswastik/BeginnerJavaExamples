// program to count the factors of the given number

import java.util.Scanner;

class FactorsOfGivenNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number which we need to find Factors of:");
		int number = sc.nextInt();
		System.out.print("Enter the size of the array:");
		int size = sc.nextInt();
		int count = 0;
		System.out.print("Enter the Array:");
		int[] array = new int[size];
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}

		for(int i=0;i<array.length;i++)
		{
			if((number % array[i] == 0) && (array[i] != number))
				count++;
		}
		System.out.println("Total number of factors of "+number+" is "+count);
	}
}


