//Write a program to print frequecy of each element in the array

import java.util.Scanner;

class FrequecyOfEachElement{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int size = sc.nextInt();
		System.out.print("Enter the Array:");

		int[] a = new int[size];
		int[] f = new int[a.length];

		for (int i=0;i<a.length;i++) 
		{
		 	a[i]=sc.nextInt();
		}

		for(int i=0;i<a.length;i++ ) 
		{
			f[i]=1;
		  	for(int j=i+1;j<a.length;j++) 
			{
		  		if(a[i]==a[j] && a[j]!=-1)
				{
		  			a[j] = -1;
		  			f[i]++;
				}
			}
		}

			
		
		System.out.println("Array Elements and their Frequencies are");		
		for (int i=0;i<a.length;i++) 
		{
			if (a[i]!=-1)
				System.out.println(a[i]+" - "+f[i]);		
		}
	}
}