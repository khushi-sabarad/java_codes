import java.util.*;
class Fibonacci
{  
    public static void main(String args[])  
    {    
        Scanner sc= new Scanner(System.in);
        int n, n1 = 0, n2 = 1, n3, i;    
        System.out.print("Enter limit: ");
        n=sc.nextInt();

        System.out.print(n1+" "+n2);  
        n3=n1+n2;
        for(i=2;n3<=n;i++)    
        {    
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3; 
            n3=n1+n2;    
        }    
        System.out.println(" Total terms= " +i);
    
    }
} 
