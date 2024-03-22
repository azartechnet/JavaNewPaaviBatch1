class Sample17
{
	public synchronized void get1() throws InterruptedException
	{
		System.out.println("In get1");
		wait(10000);
		get2();
		System.out.println("Out get1");
		
	}
	public void get2()
	{
		notify();
	}
}
public class ITC {

	public static void main(String[] args) throws InterruptedException {
		
		Sample17 t1=new Sample17();
		t1.get1();

	}

}
