//// find the missing number from the array

class MissingNumberInaList
{
	public static void main(String[] args)
	{

		int n = 10;
		int[] a = {1,2,3,4,5,6,7,9,10};
		int sum = 0;
		int sum1 = n*(n+1)/2;

		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		int diff=sum1-sum;
		System.out.println(diff);

	}
}
