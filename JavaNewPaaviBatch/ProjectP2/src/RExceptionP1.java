
public class RExceptionP1 
{
    void get1()
    {
    	try
    	{
    	int a=100/0;
    	System.out.println(a);
    	}
    	catch(ArithmeticException t)
    	{
    		System.out.println(t);
    	}
    	finally
    	{
    		get2();
    	}
    	
    }
    void get2()
    {
    	System.out.println("This is get2 function..");
    }
	public static void main(String[] args) {
	

		RExceptionP1 g1=new RExceptionP1();
		g1.get1();
		
	}

}
