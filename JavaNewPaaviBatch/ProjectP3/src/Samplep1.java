
public class Samplep1 {

	String pname="apple";//class or instance variable
	void get1()
	{
		int pid=1001;//local variable
		System.out.println("Method-1"+pid);
	}
	void get2()
	{
		System.out.println("Method-2"+pname);
	}
	public static void main(String[] args) {
		
		Samplep1 d1=new Samplep1();
		d1.get1();
		d1.get2();
	}

}
