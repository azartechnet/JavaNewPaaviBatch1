import java.util.Scanner;

class B1
{
   int a,b,c;
   Scanner sc=new Scanner(System.in);
   void get1()
   {
	   System.out.println("Enter the a value is::");
	   a=sc.nextInt();
   }
}
class D1 extends B1
{
	void get2()
	{
		System.out.println("Enter the b value is::");
		b=sc.nextInt();
	}
}
class D2 extends D1
{
	void get3()
	{
		System.out.println("Your value is::"+a+b);
	}
}
public class multilevelInheritance 
{
   public static void main(String ad[])
   {
	   D2 f1=new D2();
	   f1.get1();
	   f1.get2();
	   f1.get3();
   }
}
