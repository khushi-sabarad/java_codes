//Single Inheritance, without constructor 
import java.util.*;
class Employee
{
	String name;
	int id;
	double basic;
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee name,Employee ID and basic pay. ");
		name = sc.nextLine();
		id = sc.nextInt();
		basic = sc.nextDouble();
	}
	void display1()
	{
		System.out.println("Name = "+name);
		System.out.println("ID = "+id);
		System.out.println("Basic Pay = "+basic);
	}
}
class Salary extends Employee
{
	double DA, HRA, PF = 1200, GP, NP; 
	void calculate() 
	{
		DA = basic * 0.10;
		HRA = basic * 0.05;
		GP = basic + DA + HRA;
		NP = GP - PF;
	}
	void display2()
	{
		System.out.println("Dearness Allowance = "+DA);
		System.out.println("House Rent Allowance = "+HRA);
		System.out.println("Gross Pay = "+GP);
		System.out.println("Net Pay = "+NP);
	}
}
class Emp_Salary
{
	public static void main(String args[])
	{
		Salary s = new Salary();
		s.getdata();
		s.display1();		
		s.calculate();
		s.display2();
	}
}

