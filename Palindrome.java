import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,t,r=0,s=0,l;
		System.out.println("Enter a number");
		n=sc.nextInt();
		t=n;
		while(n!=0)
		{
			l=n%10;
			s+=l;
			r=(r*10)+l;
			n=n/10;
		}
		if(r==t)
			System.out.println("It is a palindrome number");
		else
			System.out.println("It is NOT a palindrome number");
				
		System.out.println("Sum of digits = "+s);
		System.out.println("Reverse of the number = "+r);
	}
}
