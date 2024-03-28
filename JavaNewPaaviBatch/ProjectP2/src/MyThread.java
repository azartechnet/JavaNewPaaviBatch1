
public class MyThread extends Thread
{
    public void run()
    {
    	synchronized(this) {
    		System.out.println("Thread start");
    		try
    		{
    			//Calling wait() on the current thread
    			wait();
    		}
    		catch(InterruptedException e)
    		{
    			System.out.println(e);
    		}
    		System.out.println("Thread Resumed");
    	}
    }
	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		t1.start();
		try
		{
			Thread.sleep(2000);//Sleep for 2 seconds
		}
		catch(InterruptedException t)
		{
			
		}
		synchronized (t1)
		{
		     System.out.println("Main Thread notifying the waiting thread");
		     t1.notify();
		}

	}

}
