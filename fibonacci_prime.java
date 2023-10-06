import java.util.*;
class fibonacci_prime
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a=0,b=1,c=0,n,i=1,k=0,p,j;
		System.out.println("Enter the number of elements in the series");
		n=sc.nextInt();
		int h[]=new int[n];
		System.out.println("Fibonacci Series :");
		for(i=1;i<=n;i++)
		{
			if(i==1)
				System.out.print(a+"  ");
			else if(i==2)
				System.out.print(b+"  ");
			else
			{
				c=a+b;
				if(c>1)
				{
					p=0;
					for(j=2;j<c;j++)
					{
						if(c%j==0)
							p=1;
					}
					if(p==0)
					{
						h[k]=c;
						k++;
					}	
					
				}
				a=b;
				b=c;
				System.out.print(c+"  ");
			}
		}
		System.out.println();
		System.out.println("Prime numbers from the above series are as follows");
		for(i=0;i<k;i++)
			System.out.print(h[i]+"  ");
	}
}
