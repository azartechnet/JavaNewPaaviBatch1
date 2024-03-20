
public class ThreadP1 implements Runnable
{
    public void run()
    {
    	System.out.println("This is run method..");
    	get1();
    }
    void get1()
    {
    	System.out.println("Its is normal method..");
    }
	public static void main(String[] args) 
	{
		
	    ThreadP1 t1=new ThreadP1();
	    Thread f1=new Thread(t1);
	    //ThreadP1 t2=new ThreadP1(f1);
	    //f1.start();
	   // t2.start();
     
	}

}
