//Bank-constructor
import java.util.*;
class BankC
{
	Scanner sc = new Scanner(System.in);
	String name,acc_type;
	int acc_no;
	double balance,deposit,withdraw;
	BankC (String n,String type, int no,double b) //constructor
	{
		name=n;
		acc_type=type;
		acc_no=no;
		balance=b;
 
	}
	void DepAmt()
	{
		System.out.println("Enter amount to deposit: ");
		deposit=sc.nextDouble();
		balance=balance+deposit;
	}
	void wdraw()
	{
		System.out.println("Enter withdrawal amount: ");
		withdraw=sc.nextDouble();
		if (balance<withdraw)
			System.out.println("Insuffient balance");
		else
			balance=balance-withdraw;
	}
	void display()
	{
		System.out.println("Account name: " +name);
		System.out.println("Balance: "+balance);
	}
	public static void main(String args[])
	{
		BankC ob = new BankC("Khushi","Savings",42,1000);
		ob.DepAmt();
		ob.wdraw();
		ob.display();
	} 
}
