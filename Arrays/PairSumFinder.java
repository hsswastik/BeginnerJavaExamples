import java.util.Scanner;


class PairSumFinder{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] a = {2,3,4,5,7,2,1,2,4};
int count=0;
int i = 0;
while(i<a.length)
{
	int j=i+1;
	while(j<a.length)
	{
		if(a[i]+a[j] == n)
		{
			count++;
			
		}
		j++;
	}
	i++;
	}
	System.out.println("Count of pairs: " + count);
        
}}