abstract class Sample2
{
	abstract void get1();
	void get2()
	{
		System.out.println("This is normal method");
	}
}
class Demo12 extends Sample2
{

	void get1() {
		
		System.out.println("This is Abstract method");
		
	}
	
}
public class AbstractConcepts {

	public static void main(String[] args) {
		
		Demo12 f1=new Demo12();
		f1.get1();
		f1.get2();

	}

}
