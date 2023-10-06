//Hierarchical Inheritance-example
// parent class
class P 
{
 int parentVariable = 5;
}
 
// child class
class C1 extends P 
{
 int childVariable = 1;
}
 
// child class
class C2 extends P 
{
 int childVariable = 2;
}
 
// child class
class C3 extends P 
{
 int childVariable = 3;
}
 
public class hierarchical 
{
 public static void main(String[] args) 
 {
   // object created
   C1 child1 = new C1();
   C2 child2 = new C2();
   C3 child3 = new C3();
 
   System.out.println("Parent variable + Child variable of child1 = " + (child1.parentVariable + child1.childVariable));
 
   System.out.println("Parent variable + Child variable of child2 = " + (child2.parentVariable + child2.childVariable));
 
   System.out.println("Parent variable + Child variable of child3 = " + (child3.parentVariable + child3.childVariable));
 }
}

