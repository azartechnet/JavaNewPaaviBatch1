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
	public static void main(String[] args) {
		
		Forloop f1=new Forloop();
		f1.get1();
		

	}

}
