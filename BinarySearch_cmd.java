//Binary Search COMMAND LINE ARGUMENTS
import java.util.*;
class BinarySearch_cmd
{
	public static void main(String args[])
	{
		int s,mid, low, high,c,n;
		n=args.length-1;
		low=0;
		high=n-1;
		s=Integer.parseInt(args[n]);
		while(low<=high)
		{
			mid=(low + high)/2;
			c=Integer.parseInt(args[mid]);
			if(c==s)
			{
				System.out.println("Element has been found at position "+(mid+1));
				break;
			}
			else if(c<s)
				low=mid+1;
			else
				high=mid-1;
		}
		if (low>high)
			System.out.println("Element doesn't exist");
	}

}

//OUTPUT

// C:\Java\jdk-18.0.1.1\bin>javac BS_cmd.java

// C:\Java\jdk-18.0.1.1\bin>java BS_cmd 2 3 4 5 3 4
// Element has been found at position 3
