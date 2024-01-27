import java.util.Scanner;

class Demo1
{
	int n,m,i,j;
	Scanner sc=new Scanner(System.in);
	int empid[][]=new int[2][2];
	void get1()
	{
		System.out.println("Enter the n and m::");
		n=sc.nextInt();
		m=sc.nextInt();
	}
	void get2()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Enter the Array value is::");
				empid[i][j]=sc.nextInt();
			}
		}
	}
	void get3()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Your value is::"+empid[i][j]);
			}
		}
	}
}
public class ArrayP2 {

	public static void main(String[] args) {
		
		Demo1 g1=new Demo1();
		g1.get1();
		g1.get2();
		g1.get3();

	}

}
