class Demo13
{
	void get1(int pid,String pname)
	{
		System.out.println("Your Pid is::"+pid+"Your Pname is::"+pname);
	}
	void get1(int cid)
	{
		System.out.println("your cid is::"+cid);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
	
		Demo13 f1=new Demo13();
		f1.get1(1001,"apple");
		f1.get1(2001);

	}

}
