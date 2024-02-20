class B13
{
	int a=100;
	void get1()
	{
		//int a=400;
		System.out.println("BaseClass value is::"+a);
	}
}
class D13 extends B13
{
	void get2()
	{
		int a=200;
		System.out.println("Dervied value is::"+super.a);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
	
		D13 f1=new D13();
		f1.get1();
		f1.get2();

	}

}
