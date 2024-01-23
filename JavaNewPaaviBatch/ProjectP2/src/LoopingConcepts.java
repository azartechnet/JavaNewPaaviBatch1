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
	/*void factProgram()
	{
		int fact=1;
		for()
		{
			
		}
	}*/
}
public class LoopingConcepts {

	public static void main(String[] args) {
	
		Sample12 f1=new Sample12();
		//f1.forloop();
		//f1.forloopoddeven();
		f1.nestedforloop();
	}

}
