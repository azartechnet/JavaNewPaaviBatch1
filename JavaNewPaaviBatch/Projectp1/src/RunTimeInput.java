import java.util.Scanner;

public class RunTimeInput {

	int empid,salary;
	String empname;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the empid::");
		empid=sc.nextInt();
		System.out.println("Enter the salary:::");
		salary=sc.nextInt();
		System.out.println("Enter the empname::");
		empname=sc.next();
	}
	void display()
	{
		System.out.println("Your value is::"+empid+","+salary+","+empname);
	}
	public static void main(String[] args) {
	
		RunTimeInput r1=new RunTimeInput();
		r1.input();
		r1.display();

	}

}
