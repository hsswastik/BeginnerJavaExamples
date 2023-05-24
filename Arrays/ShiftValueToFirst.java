// Shift the value to first

import java.util.Scanner;
class ShiftValueToFirst{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n = sc.nextInt();
		System.out.print("Enter the Array:");
		int[] a = new int[n];

		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the Number which to be Shifted First:");
		int tab = sc.nextInt();
		int temp = a[tab-1];
		
		for(int i=tab-2; i>=0;i--){
			a[i+1]=a[i];
		}

		a[0]=temp;

		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}