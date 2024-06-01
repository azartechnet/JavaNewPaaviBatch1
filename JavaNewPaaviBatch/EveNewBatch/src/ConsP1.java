class Foo1
{
	Foo1()
	{
		System.out.println("Default cons...");
	}
	Foo1(int pid,String pname)
	{
		System.out.println("Param Cons.."+pid+""+pname);
	}
	void get1()
	{
		System.out.println("Its normal methods..");
	}
}
public class ConsP1 {

	public static void main(String[] args) {
		
		new Foo1();
		Foo1 f1=new Foo1(1001,"apple");
		
         f1.get1();
	}

}
