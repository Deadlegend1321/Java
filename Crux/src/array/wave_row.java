package array;

import java.util.Scanner;

public class wave_row {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c;
		Scanner sc =new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		int[][] a = new int [r][c];
		for(int i = 0;i<r;i++)
		{
			for(int j = 0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<c;j++)
				{
					System.out.print(a[i][j]+", ");
				}
			}
			else
			{
				for(int j=c-1;j>=0;j--)
					System.out.print(a[i][j]+", ");
			}
		}
		System.out.print("END");

	}

}
