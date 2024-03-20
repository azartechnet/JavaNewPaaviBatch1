
public class ThreadP3 extends Thread
{
	public void run()
	{
		System.out.println("Its is run method..");
	}

	public static void main(String[] args) {
		
		ThreadP3 t1=new ThreadP3();
		ThreadP3 t2=new ThreadP3();
		t1.start();
		try
		{
			System.out.println("JoinIN");
			t1.join();
			System.out.println("JoinOUT");
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
		t2.start();
		

	}

}
