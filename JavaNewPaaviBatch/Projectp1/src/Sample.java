
public class Sample {

	void get1()
	{
		System.out.println("This is get1 method");
	}
	void get2()
	{
		System.out.println("This is get2 method");
	}
	public static void main(String[] args) {
		
		System.out.println("This is main function");
		
		Sample s1=new Sample();
		s1.get2();
		s1.get1();

	}

}
