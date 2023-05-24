// Remove duplicate elements from the array
import java.util.Scanner;


class RemoveDuplicateElement{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int size = sc.nextInt();
		System.out.print("Enter the Array:");
		int[] a = new int[size];
		int count = 0;
		for (int i=0;i<a.length;i++) 
		{
		 	a[i]=sc.nextInt();
		}
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
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}

	}
}