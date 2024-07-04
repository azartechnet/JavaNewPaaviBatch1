class SharedResources
{
	private boolean ready=false;
	
	public synchronized void waitUntilReady()
	{
		while(!ready)
		{
			try
			{
				wait();
			}catch(InterruptedException e)
			{
				System.out.println("Thread was Interrupted..");
			}
		}
		System.out.println(Thread.currentThread().getName()+"Resources is ready");
	}
	public synchronized void makeReady()
	{
		ready=true;
		notify();//Notify one waiting thread
	}
}
class WaitingThread extends Thread
{
	private SharedResources resource;
	
	public WaitingThread(SharedResources resource) {
		
		this.resource=resource;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"Waiting for the resource to be ready");
		resource.waitUntilReady();
		System.out.println(Thread.currentThread().getName()+"Finished waiting");
	}
}
public class WaitThreadP1 

{

	public static void main(String[] args) {
		
		SharedResources resource=new SharedResources();
		
		WaitingThread w1=new WaitingThread(resource);
		
		w1.start();
		
		try
		{
			w1.join(1000);
		}
		catch(InterruptedException t)
		{
			System.out.println("Main thread Exception");
		}

	}

}