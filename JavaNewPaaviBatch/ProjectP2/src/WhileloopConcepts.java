import java.util.Scanner;

public class WhileloopConcepts {

	int i,n;
	Scanner  sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
	}
	void get2()
	{
		i=0;
		while(i<=n)
		{
			System.out.println("I value is::"+i);
			i++;
		}
	}
	void get3()
	{
		do
		{
			System.out.println("I value is::"+i);
			i=i+1;
		}
		while(i<=n);
	}
	void get4()
	{
		int reverse=0;
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		while (n != 0)
		   {
		      reverse = reverse * 10;
		      reverse = reverse + n%10;
		      n       = n/10;
		   }
		System.out.println("Reverse value is::"+reverse);
	}
	void get5()
	{
		int t;
		int remainder=0,sum=0;
		System.out.println("Enter the t value is::");
		t=sc.nextInt();
		while (t != 0)
		   {
		      remainder = t % 10;
		      sum       = sum + remainder;
		      t         = t / 10;
		      System.out.println("Your sum is::"+sum);
		   }
		
	}
	public static void main(String[] args) {
		
		
		WhileloopConcepts t1=new WhileloopConcepts();
		//t1.get1();
		//t1.get2();
		//t1.get3();
		//t1.get4();
		t1.get5();

	}

}
