import java.util.Scanner;

public class Forloop {

	int i,n;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println("I value is::"+i);
		}
	}
	void get2()
	{
		
		int fact=1;
		for(i=1;i<=3;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Your value is::"+fact);
	}
	void get3()
	{
		for(i=0;i<=5;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number is::"+i);
			}
			else
			{
				System.out.println("Odd Number is::"+i);
			}
		}
	}
	public static void main(String[] args) {
		
		Forloop f1=new Forloop();
		//f1.get1();
		//f1.get2();
		f1.get3();

	}

}
