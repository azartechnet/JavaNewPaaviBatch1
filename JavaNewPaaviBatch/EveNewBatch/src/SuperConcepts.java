class B13
{
	int empid=1001;
	void get1()
	{
		System.out.println("BaseClass value::"+empid);
	}
}
class D13 extends B13
{
	void get2()
	{
		int empid=1002;
		System.out.println("Dervied class value is::"+super.empid);
	}
}
public class SuperConcepts {

	public static void main(String[] args) {
	
		D13 f1=new D13();
		f1.get1();
		f1.get2();

	}

}
