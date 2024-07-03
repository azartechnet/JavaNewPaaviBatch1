class Demo16 implements Runnable
{
	public void run()
	{
		System.out.println("This is Thread run method");
	}
	void get1()
	{
		System.out.println("This is Normal method");
	}
}
public class ThreadP1 {

	public static void main(String[] args) {
		
		Demo16 f1=new Demo16();
		Thread t1=new Thread(f1);
		t1.start();
		f1.get1();

	}

}
