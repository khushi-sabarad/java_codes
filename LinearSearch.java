import java.util.*;
class LinearSearch
{	
	public static void main(String args[])
   	{
      		int size,search, a[];
     	 	Scanner sc = new Scanner(System.in);
      		System.out.print("Array size: ");
      		size = sc.nextInt();
		a = new int[size];
		System.out.print("Array elements: ");
		for (int i=0; i<size; i++)
          		a[i] = sc.nextInt();
		System.out.print("Search element: ");
      		search = sc.nextInt();
      		
		for (int i=0; i<size; i++)
		{
         		if ( a[i] == search)
           		{
				System.out.print( search+ " found at location " + (i+1));
				break;
         		}
			 if (i == size)
	       			System.out.print(search+ " is not found.");
				
		}
	}
}
