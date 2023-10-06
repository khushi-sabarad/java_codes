import java.util.*;
class Armstrong
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,t,l,a=0;
		System.out.println("Enter a number");
		n=sc.nextInt();
		t=n;
		while(n!=0)
		{
			l=n%10;
			a+=(l*l*l);
			n=n/10;
		}
		if(a==t)
			System.out.println("It is an armstrong number");
		else
			System.out.println("It is NOT an armstrong number");
	}
}
