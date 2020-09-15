package KuchBhi;


public class topsome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] z = {4,3,6,1};
		int a = marathon(4,3,z);
		System.out.print(a);
	}
	public static int marathon (int input1,int input2, int[] input3)
	{
		int[] g = new int[input2];
		int s=0,k=0,sum=0;
		for(int i=0;i<input1;i++)
		{
			if(input3[i]>s)
			{
				s=input3[i];
			}
		}
		g[0]=s;
		for(int i=1;i<input2;i++)
		{  g[k+1] = 0;
			for(int j=0;j<input1;j++)
			{
				if(input3[j]>0)
				{
					if(input3[j]<g[k] && input3[j]>g[k+1])
					g[k+1]=input3[j];
				}
			}
			k++;
		}
		for(int i=0;i<input2;i++)
		{
			sum+=g[i];
		}
		return sum;
	}

}
