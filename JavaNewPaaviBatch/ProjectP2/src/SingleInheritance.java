class B
{
	int empid=1001;
	void get1()
	{
		System.out.println("This is Base class");
	}
}
class D1 extends B
{
	String empname="mohamed";
	void get2()
	{
		System.out.println("This is Dervied class"+empid);
	}
}
class D2 extends D1
{
	void get3()
	{
	    System.out.println("This is final Dervied class::"+empname);	
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();

	}

}
