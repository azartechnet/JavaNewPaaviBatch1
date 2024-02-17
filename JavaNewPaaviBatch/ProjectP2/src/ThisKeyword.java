class Employee
{
	int empid;
	String empname;
	void get1(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
		System.out.println("Your get1 value is::"+empid+""+empname);
	}
	void get2()
	{
		System.out.println("Your get2 value is::"+empid+""+empname);
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		
		Employee f1=new Employee();
		f1.get1(1001,"azar");
		f1.get2();

	}

}
