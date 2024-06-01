interface B11
{
	void get1();
}
interface B12
{
	void get2();
}
class D11 implements B11,B12
{
	public void get1()
	{
		System.out.println("Interface concepts-1");
	}
	public void get2()
	{
		System.out.println("Interface concepts-2");
	}
}


public class Foo {

	public static void main(String[] args) {
		
		
		D11 f1=new D11();
		f1.get1();
		f1.get2();

	}

}
