abstract class Sample13
{
	abstract void get1();//abstract method
	void get2()
	{
		System.out.println("Its is Normal Method");
	}
}
class D12 extends Sample13
{
	public void get1()
	{
		System.out.println("Its is Abstract method");
	}
}
public class AbstractConcepts {

	public static void main(String[] args) {
		
		D12 f1=new D12();
		f1.get1();
		f1.get2();

	}

}
