package array;

import java.util.Scanner;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,c=0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		long[] a = new long[n];
		for(int i= 0;i<n;i++)
		{
			a[i] = s.nextLong();
		}
		m = s.nextInt();
		int l =0 , h= a.length-1;
		while(l<=h)
		{
			int mid = (l+h)/2;
			if(a[mid]<m)
				l = mid+1;
			else if(a[mid]>m)
				h = mid - 1;
			else
			{
				System.out.print(mid);
				c++;
				break;
			}
		}
		if(c==0)
			System.out.print("-1");
		

	}

}
