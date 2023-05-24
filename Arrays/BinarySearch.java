// binary search
// Binary Search need to be sorted first
import java.util.Scanner;
import java.util.Arrays;


class BinarySearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//=================OR #1============

		System.out.print("Enter the size of the array:");
		int size = sc.nextInt();
		System.out.print("Enter the Array:");
		int[] a=new int[size];

		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();

		// Arrays.sort(a);//Taking array from user and Sort using Inbuit Function

					//OR

		// for(int i=0;i<a.length;i++) //Taking array from user and Sort using Hard Code
		// {
		// 	for(int j=i+1;j<a.length;j++)
		// 	{
		// 		if(a[i]>a[j])
		// 		{
		// 			a[i]=a[j]-a[i]+(a[j]=a[i]);
		// 		}
		// 	} 
		// }

		//=================OR #2============
		
		// int [] a= {3,9,1,5,6,2,4,7}; //Directly Insert the Array and use Inbuit function
		// Arrays.sort(a);

		//==============OR #3===============

		// int[] a = {0,1,2,3,4,5,6,7,8,9,10}; //Directly Insert the Sorted Array

		


		
		// Main Logic

		System.out.print("Enter the Number to be Searched: ");
		int key=sc.nextInt();
		boolean flag = false;
		int low = 0;
		int mid = 0;
		int high = a.length-1;
		int index=0;

		while(low<=high)
		{
			mid = low+(high-low)/2;
		
			if(key==a[mid])
			{
				index = mid;
				flag = true;
				break;
			}
			else if(key<a[mid])
				high = mid-1;

			else 
				low = mid+1;
		}

		if (flag==true)
		{
			System.out.println("element is at index "+index);
			System.out.println("Its in the Position: "+ (index + 1));
		}
		else 
			System.out.println("element is not present");
	}
}