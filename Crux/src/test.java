import java.util.*;
public class test {
    public static void main(String args[]) {
		int a,b,n,c=0,p=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(n!=0)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			for(int i = a;i<=b;i++)
			{
				for(int j = i;j!=0;j--)
				{
					if(i%j==0)
					c++;
				}
				if(c==2)
				p++;
				c=0;
			}
			System.out.println(p);
			p=0;
			n--;
		}

    }
}