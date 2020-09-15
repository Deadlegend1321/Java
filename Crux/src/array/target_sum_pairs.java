package array;

import java.util.Scanner;

public class target_sum_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,c=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		for(int i= 0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		m = sc.nextInt();
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
		for(int i = 0 ; i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					if(m/2==a[i] && m%2==0)
						c=i;
					break;
				}
				else
				{
					if(j!=n-1 && a[j] == a[j+1])
					{
							continue;
					}
					else if(a[i]==m-a[j])
						System.out.println(a[i]+" and "+a[j]);
				}
			}
		}
		if(c>0)
			System.out.println(a[c]+" and "+a[c]);

	}

}
