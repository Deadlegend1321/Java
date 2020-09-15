package array;

import java.util.Scanner;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		long[] a= new long[n]; 
		for(int i= 0;i<n;i++)
		{
			a[i] = sc.nextLong();
		}
		for(int c = 0;c<n;c++)
		{
			int min = c;
			for(int j= c+1;j<n;j++)
			{
				if(a[j]<a[min])
					min = j;
			}
			long temp = a[min];
			a[min] = a[c];
			a[c] = temp;
		}
		for(int i= 0;i<n;i++)
		{
			System.out.println(a[i]);
		}

	}

}
