class B1
{
	protected  int empid=1001;
	void get1()
	{
		System.out.println("Base class value is::"+empid);
	}
}
class D extends B1
{
	void get2()
	{
	   int empid=1002;
	   System.out.println("Dervied class value is::"+super.empid);
	}
}
public class SuperConcepts {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
