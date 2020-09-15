package array;

import java.util.Scanner;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner (System.in);
		n =sc.nextInt();
		int[] a = new int[n];
		for(int i= 0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i= 0;i<n;i++)
		{
			for(int j= 0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]= a[j+1];
					a[j+1]= temp;
				}
			}
		}
		for(int i= 0;i<n;i++)
		{
			System.out.println(a[i]);
		}

	}

}
