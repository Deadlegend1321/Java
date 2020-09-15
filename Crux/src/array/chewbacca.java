package array;

import java.util.ArrayList;
import java.util.Scanner;

public class chewbacca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x,d;
		int m = 0;
		ArrayList<Long> l = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		x = sc.nextLong();
		for(long i = x; i!=0; i=i/10)
		{
			d = i%10;
			if(d>4)
			{
				d=9-d;
				l.add(m, d);
				m++;
			}
			else
			{
				l.add(m, d);
				m++;
			}
		}
		if(l.get(m-1)== 0)
		{
			l.remove(m-1);
			l.add(m-1, (long) 9);
		}
		for(int j=m-1;j!=-1;j--)
			System.out.print(l.get(j));

	}

}
