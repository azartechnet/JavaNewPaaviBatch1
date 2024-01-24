import java.util.Scanner;

class Sample12
{
	int i,j,n;
	Scanner sc=new Scanner(System.in);
	void forloop()
	{
		for(i=0;i<5;i++)
		{
			System.out.println("I value is::"+i);
		}
	}
	void forloopoddeven()
	{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		System.out.println("Enter the inital value is::");
		int a=sc.nextInt();
		for(i=a;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("Its even is::"+i);
			}
			else
			{
				System.out.println("Its Odd is::"+i);
			}
		}
	}
	void nestedforloop()
	{
		int i,j,n,m;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("I value is::"+i+"J value is::"+j);
			}
		}
	}
	void factProgram()
	{
		
		int a=10,b=20,t;
//		t=a;
//		a=b;
//		b=t;
//		System.out.println("Swap the value is::"+a+""+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swap without 3rd variable is::"+a+""+b);
		
		
	}
	void fibo()
	{
		 int n, first = 0, second = 1, next, c;
	      System.out.println("Enter the n value is::");
	      n=sc.nextInt();
	      for ( c = 0 ; c <=n ; c++ )
	   {
	      if ( c <= 1 )
	         next = c;
	      else
	      {
	         next = first + second;
	         first = second;
	         second = next;
	      }
	     System.out.println(next);
	   }
	}
}
public class LoopingConcepts {

	public static void main(String[] args) {
	
		Sample12 f1=new Sample12();
		//f1.forloop();
		//f1.forloopoddeven();
		//f1.nestedforloop();
		//f1.factProgram();
		f1.fibo();
	}

}
