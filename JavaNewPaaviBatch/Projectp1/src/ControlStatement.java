import java.util.Scanner;

public class ControlStatement {

	int pid;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the pid is::");
		pid=sc.nextInt();
		if(pid==1001)
		{
			System.out.println("Your Pid is::equal::"+pid);
		}
		else
		{
			System.out.println("Your Pid is::NotEqual::"+pid);
		}
	}
	void get2()
	{
		int p;
		System.out.println("Enter the p value is::");
		p=sc.nextInt();
		if(p%2==0)
		{
			System.out.println("Its even::"+p);
		}
		else
		{
			System.out.println("Its is not even::"+p);
		}
	}
	void get3()
	{
		int age,salary,bns;
		System.out.println("Enter the age is::");
		age=sc.nextInt();
		if(age>60)
		{
			System.out.println("Enter the salary is::");
			salary=sc.nextInt();
			if(salary>=20000)
			{
				bns=salary+500;
				System.out.println("Your salary is:"+bns);
			}
			else
			{
				bns=salary+1000;
				System.out.println("Your salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Your age is low");
		}
	}
	
	public static void main(String[] args) {
		
		
		
		ControlStatement s1=new ControlStatement();
		//s1.get1();
		//s1.get2();
		s1.get3();

	}

}
