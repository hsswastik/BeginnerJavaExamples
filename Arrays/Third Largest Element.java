// find the third largest element in the array

import java.util.Scanner;

class ThirdLargestElement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int size = sc.nextInt();
		int count=0;
		System.out.print("Enter the Array:");
		int[] a = new int[size];
		
		for (int i=0;i<a.length;i++) 
		 	a[i]=sc.nextInt();
		
		
		for(int i=0;i<a.length;i++ ) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j] && a[j]!=-1)
				{
					a[j] = -1;
					count++;
				}
			}	
		}
		int[] b = new int[a.length-count];
		int temp = 0;
	
		for (int i=0;i<a.length;i++)
		{
		
			if (a[i]!=-1)
				b[temp++]=a[i];

			if(b.length>3)
			{
				for(i=0;i<b.length;i++)
				{
					for(int j=i+1;j<b.length;j++)
					{
						if(b[i]>b[j])
						{
							b[i]=b[j]-b[i]+(b[j]=b[i]);
						}
					}	
				}
			}	
			System.out.print(b[b.length - 3]);
			break;
		}
	}	
}	
		
		