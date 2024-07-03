class Demo17 extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("RunIN");
			System.out.println("CurrentThreadName::"+currentThread().getName());
			System.out.println("CurrentThreadPriority::"+currentThread().getPriority());
			Thread.sleep(10000);
			System.out.println("RunOut");
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
		
	}
}
public class ThreadP2 {

	public static void main(String[] args) {
		
		Demo17 f1=new Demo17();
		Demo17 f2=new Demo17();
		f1.setName("sdlc");
		f1.setPriority(Thread.MAX_PRIORITY);
		f1.start();
		f2.start();

	}

}
