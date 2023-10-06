import java.util.*;
class BubbleSort
{	
	public static void main(String args[])
   	{
      		int size,a[],x;
     	 	Scanner sc = new Scanner(System.in);
      		System.out.println("Array size: ");
      		size = sc.nextInt();
		a = new int[size];
		System.out.println("Array elements: ");
		for (int i=0; i<size; i++)
          		a[i] = sc.nextInt();

		for (int i=0; i<(size-1); i++) //for(i=size-1;i>0;i--)
		{
         		for(int j=0; j<(size-i-1); j++) //for(j=0;j<i;j++)
			{
				if(a[j]>a[j+1])
            			{
               				x = a[j];
               				a[j] = a[j+1];
               				a[j+1] = x;
            			}
         		}
      		}
		System.out.println("Sorted array:");
      		for(int i=0; i<size; i++)
         		System.out.print(a[i]+ " ");
	}
}
