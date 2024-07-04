
public class ThreadP3 extends Thread
{
	private String threadName;
	
	public ThreadP3(String name) {
		
		threadName=name;
	}
	
	public void run()
	{
		System.out.println(threadName+"is starting..");
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
		System.out.println(threadName+"has finished");
	}

	
	public static void main(String[] args) {
		
		ThreadP3 t1=new ThreadP3("Thread-1");
		ThreadP3 t2=new ThreadP3("Thread-2");
		ThreadP3 t3=new ThreadP3("Thread-3");
	
		//Start the thread
		t1.start();
		t2.start();
		t3.start();
		
		//join the threads
		try
		{
			t1.join(10000);
			System.out.println("Joined"+t1.getName());
			t2.join();
			System.out.println("Joined"+t2.getName());
			t3.join();
			System.out.println("Joined"+t3.getName());
		}
		catch(InterruptedException t)
		{
			System.out.println("Main interruped while joining..");
		}
		System.out.println("All threads have finished execution..");
	}

}