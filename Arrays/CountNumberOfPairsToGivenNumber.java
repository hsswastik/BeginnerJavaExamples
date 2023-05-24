//Count number of pairs whose sum is equal to the given number


import java.util.Scanner;


class CountNumberOfPairsToGivenNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = {2,3,4,5,7,2,1,2,4};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==n)
				{
					count++;
				}

			}
			
		}
		System.out.println(count);
	}
}
