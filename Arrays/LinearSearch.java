// Linear Search
import java.util.Scanner;

class LinearSearch
{
 public static void main(String[] args)
    {
 		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int size = sc.nextInt();
		System.out.print("Enter the Array:");
		int[] a=new int[size];
		boolean flag = false;

		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
			
		System.out.print("Enter the Number to be Searched: ");
		int key = sc.nextInt();
		int index=0;

		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				index = i;
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Key is found at index: "+index);
			System.out.println("Its in the Position: "+ (index + 1));
		}
			
		else
			System.out.println("key not found");
	}
}