//Multilevel Inheritance-University
import java.util.*;
class University
{
Scanner sc=new Scanner (System.in);
String uname,ulocation,uacc;
void read1()
{
System.out.println("Enter university name ");
uname=sc.nextLine();
System.out.println("Enter university location ");
ulocation=sc.nextLine();
System.out.println("Enter university date of accreditation ");
uacc=sc.nextLine();
}

void display1()
{
System.out.println("University name is "+uname);
System.out.println("University location is "+ulocation);
System.out.println("University date of accreditation is "+uacc);
}
}
class College extends University
{
String cname,clocation,cacc;
void read2()
{
System.out.println("Enter college name ");
cname=sc.nextLine();
System.out.println("Enter college location ");
clocation=sc.nextLine();
System.out.println("Enter college date of accreditation ");
cacc=sc.nextLine();
}
void display2()
{
System.out.println("College name is "+cname);
System.out.println("College location is "+clocation);
System.out.println("College date of accreditation is "+cacc);
}
}
class Course extends College
{
String course_name, duration;
double fees;
void read3()
{
System.out.println("Enter course name ");
course_name=sc.nextLine();
System.out.println("Enter course duration ");
duration=sc.next();
System.out.println("Enter course fee ");
fees=sc.nextDouble();
}
void display3()
{
System.out.println("Course name is "+course_name);
System.out.println("Course fee is "+fees);
System.out.println("Course duration is "+duration);
}
}
class MultilevelUni
{
public static void main(String args[])
{
Course c = new Course();
c.read1();
c.read2();
c.read3();
c.display1();
c.display2();
c.display3();
}
}
