//To Print Even elements in the list

import java.util.Scanner;

class EvenElementsInArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int size = sc.nextInt();
		System.out.print("Enter the Array:");
		int[] array = new int[size];


		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}

		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				System.out.print(array[i]+" ");
			}
		}
	}
}
		
 