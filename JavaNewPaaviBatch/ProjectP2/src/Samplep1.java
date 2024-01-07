class Demo
{
	String empname="Mohamed";
	int salary=10000;//class variable
	void get1()
	{
		int empid=1001;//local variable
		System.out.println("This is get1"+empid+"Employee Name is::"+empname);
	}
	void get2()
	{
		System.out.println("This is get2"+salary);
	}
}
public class Samplep1 {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
