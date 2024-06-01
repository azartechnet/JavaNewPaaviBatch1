abstract class Sample12
{
	abstract void fun1();
	void get1()
	{
		System.out.println("To define get1 function");
	}
}
class D12 extends Sample12
{
	public void fun1()
	{
		System.out.println("Abstract define");
	}
}
public class AbstractP1 {

	public static void main(String[] args) {
		
		D12 f1=new D12();
		f1.get1();
		f1.fun1();

	}

}
