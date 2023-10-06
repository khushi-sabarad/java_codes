//Converting binary to decimal
import java.util.*;
class BinaryDecimal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,l,d=0,i,t,k=0;
		System.out.println("Enter a binary number");
		n=sc.nextInt();
		while(n!=0)
		{
			l=n%10;
			t=1;
			for(i=0;i<k;i++)
				t*=2;
			d+=(t*l);
			k++;
			n=n/10;
		}
		System.out.println("The corresponding decimal number = "+d);
	}
}
