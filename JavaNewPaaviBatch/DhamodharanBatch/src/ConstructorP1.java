class Demo11
{
	public Demo11()
	{
		System.out.println("This is default cons...");
	}
	Demo11(int empid,String empname)
	{
		System.out.println("This is empid and empname is::"+empid+""+empname);
		get1();
	}
	void get1()
	{
		System.out.println("Its is Normal method..");
	}
}
public class ConstructorP1 {

	public static void main(String[] args) {
	
		new Demo11();//Default const
		new Demo11(1001,"azar");
		
		

	}

}
