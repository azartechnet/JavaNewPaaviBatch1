import java.util.Scanner;

class B
{
	int pid;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the pid is::");
		pid=sc.nextInt();
	}
}
class D extends B
{
	void get2()
	{
		System.out.println("Your value is::"+pid);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
