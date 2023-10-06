import java.util.*;
class Matrices
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m1,n1,m2,n2,i,j,k;
		char c;
		System.out.println("FIRST MATRIX:");
		System.out.println("Order: ");
		m1=sc.nextInt();
		n1=sc.nextInt();
		System.out.println("Elements: ");
		int a[][]=new int[m1][n1];
		for(i=0; i<m1; i++)
		{
			for(j=0;j<n1;j++)
			{
				if(j==0)
					System.out.println("Enter element into row : "+(i+1));
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("SECOND MATRIX:");
		System.out.println("Order: ");
		m2=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("Elements: ");
		int b[][]=new int[m2][n2];
		for(i=0; i<m2; i++)
		{
			for(j=0;j<n2;j++)
			{
				if(j==0)
					System.out.println("Enter element into row : "+(i+1));
				b[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Enter the respective sign for the operation to be performed");
		System.out.println("+ for addition, - for subtraction, * for multiplication");
		c=sc.next().charAt(0);
		if(c=='+')
		{
			if(m1==m2 && n1==n2)
			{
				System.out.println("Result after ADDITION:");
				for(i=0; i<m2; i++)
				{
					for(j=0;j<n2;j++)
					{
						System.out.print(a[i][j]+b[i][j]+"  ");
					}
					System.out.println();
				}
			}
			else
				System.out.println("The order of the matrices are not equal");
		}
		else if(c=='-')
		{
			if(m1==m2 && n1==n2)
			{
				System.out.println("Result after SUBTRACTION:");
				for(i=0; i<m2; i++)
				{
					for(j=0;j<n2;j++)
					{
						System.out.print(a[i][j]-b[i][j]+"  ");
					}
					System.out.println();
				}
			}
			else
				System.out.println("The order of the matrices are not equal");
		}
		else if(c=='*')
		{
			if(n1==m2)
			{
				int s[][]=new int[m1][n2];
				for(i=0;i<m1;i++)
				{    
					for(j=0;j<n2;j++)
					{    
						s[i][j]=0;      
						for(k=0;k<n1;k++)      
						{      
							s[i][j]+=a[i][k]*b[k][j];      
						}  
						System.out.print(s[i][j]+"  ");   
					}
					System.out.println();    
				}
			} 
			else
				System.out.println("The order of the matrices are not suitable for multiplication");   
		}
		else
			System.out.println("Invalid operation");
	}
}
