import java.util.Scanner;


public class Demo12
{
	int empid;
	String empname;
	Scanner sc=new Scanner(System.in);
    void input()
    {
    	System.out.println("Enter the empid and empname is::");
    	empid=sc.nextInt();
    	empname=sc.next();
    }
    void display()
    {
    	System.out.println("Your value is::"+empid+""+empname);
    }
	public static void main(String[] args) {
		
		Demo12 f1=new Demo12();
		f1.input();
		f1.display();

	}

}
