
public class ExceptionP1 {

	void get1()
	{
		try
		{
			int a=100/0;
			System.out.println("Your value is::"+a);
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please check the value"+t.getMessage());
		}
		get2();
	}
	void get2()
	{
		System.out.println("Its get2 function");
	}
	void get3()
	{
		String name=null;
		System.out.println("Total length::"+name.length());
	}
	void get4()
	{
		try
		{
			try
			{
				int a=100/0;
				System.out.println("Your value is::"+a);
			}
			catch(ArithmeticException t)
			{
				
			}
			try
			{
				String name=null;
				System.out.println("Total length::"+name.length());
			}
			catch(NullPointerException t)
			{
				
			}
		}
		catch(Exception t)
		{
			
		}
	}
	public static void main(String[] args) {
		
		ExceptionP1 f1=new ExceptionP1();
		//f1.get1();
		f1.get3();

	}

}
