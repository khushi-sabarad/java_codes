import java.util.*;
class BinarySearch
{	
	public static void main(String args[])
   	{
      		int size,search, a[], first=0, last, mid;
     	 	Scanner sc = new Scanner(System.in);
      		System.out.println("Array size: ");
      		size = sc.nextInt();
		a = new int[size];
		last=size-1;
		mid=(first + last)/2;
		System.out.println("Array elements: ");
		for (int i=0; i<size; i++)
          		a[i] = sc.nextInt();
		System.out.println("Search element: ");
      		search = sc.nextInt();
      		while( first <= last )
      		{
         		if ( a[mid] < search)
           			first = mid + 1;
         		else if ( a[mid] == search)
         		{
           			System.out.println( search+ " found at location " + (mid+1));
           			break;
         		}
         		else
         			last = mid-1;
         		mid = (first + last)/2;
      		}
      		if ( first > last )
          		System.out.println( search+ " is not found.");
	}
}
