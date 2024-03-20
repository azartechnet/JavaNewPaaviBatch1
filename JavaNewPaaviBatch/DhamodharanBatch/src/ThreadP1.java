
public class ThreadP1 implements Runnable
{

	public void run()
	{
		try
		{
			System.out.println("Its is Normal thread function");
			
			for(int i=0;i<=5;i++)
			{
				Thread.sleep(10000);
				System.out.println(i);
			}
			
			get1();
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
		
	}
	void get1()
	{
		System.out.println("Its is normal method");
	}
	public static void main(String[] args) {
		
		ThreadP1 t1=new ThreadP1();
		Thread f1=new Thread(t1);
		f1.start();
	
	}

}
