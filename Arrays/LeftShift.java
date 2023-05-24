// Left Shift One Time
import java.util.Scanner;


class LeftShift
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int size = sc.nextInt(); 
		int[] a = new int[size];
		System.out.print("Enter the Array:");
		
		for (int i=0;i<a.length;i++ ) 
			a[i]=sc.nextInt();
		
		System.out.print("Enter the Number of times to be shifted:");
		int shift = sc.nextInt();
		while(shift!=0)
		{

			int temp = a[0];
			for (int i=1;i<a.length ;i++ ) 
			{
				a[i-1]=a[i];
			}
			a[a.length-1]=temp;

			shift--;
		}
		System.out.print("Shifted array is: ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
}