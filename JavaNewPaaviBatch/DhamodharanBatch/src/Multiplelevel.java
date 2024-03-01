import java.util.Scanner;

class B
{
	int empid;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the empid is::");
		empid=sc.nextInt();
	}
}
class D1 extends B
{
	String empname;
	void get2()
	{
		System.out.println("Enter the empname is::");
		empname=sc.next();
	}
}
class D2 extends D1
{
	void get3()
	{
		System.out.println("Your Value is::"+empid+""+empname);
	}
}
public class Multiplelevel {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();

	}

}
