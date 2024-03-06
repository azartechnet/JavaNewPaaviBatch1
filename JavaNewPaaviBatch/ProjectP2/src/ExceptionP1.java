import java.util.InputMismatchException;
import java.util.Scanner;

class Demo14
{
	void get1()
	{
		try
		{
		int a=100/0;
		System.out.println("Your value is::"+a);
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please check the value"+t);
		}
		get2();
	}
	void get2()
	{
		System.out.println("You are in get2 function..");
	}
	void get3()
	{
		try
		{
			//String name="vetri";
			String name=null;
			System.out.println("Length::"+name.length());
		}
		catch(NullPointerException r)
		{
			System.out.println("Please check");
		}
	}
	void get4()
	{
		
		try
		{
		   int pid;
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the pid is::");
		   pid=sc.nextInt();
		   System.out.println("Your value is::"+pid);
		}
		catch(InputMismatchException t)
		{
			System.out.println(t);
		}
	}
}
public class ExceptionP1 {

	public static void main(String[] args) {
		
		Demo14 f1=new Demo14();
		//f1.get1();
		//f1.get3();
		f1.get4();
		

	}

}
