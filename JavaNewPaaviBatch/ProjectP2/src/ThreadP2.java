
public class ThreadP2 extends Thread
{

	public void run()
	{
		System.out.println("Your current thread is::"+currentThread().getName());
		System.out.println("Your current Priority is::"+currentThread().getPriority());
		for(int i=0;i<=5;i++)
		{
			try
			{
				System.out.println("loading..");
				Thread.sleep(10000);
				System.out.println(i);
			}
			catch(InterruptedException t)
			{
				System.out.println(t);
			}
		
		}
	}
	public static void main(String[] args) {
		

		ThreadP2 f1=new ThreadP2();
		ThreadP2 f2=new ThreadP2();
		f1.setName("sdlc");
		f1.setPriority(MAX_PRIORITY);
		f1.start();
		f2.start();
	}

}
