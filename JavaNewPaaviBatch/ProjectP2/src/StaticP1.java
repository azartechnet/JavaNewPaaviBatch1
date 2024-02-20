
public class StaticP1 {

	static int a=100;
	void get1()
	{
		
		a++;
		System.out.println("A value is::"+a);
	}
	public static void main(String[] args) {
		
		StaticP1 f1=new StaticP1();
		f1.get1();
		StaticP1 f2=new StaticP1();
		f2.get1();
		

	}

}
