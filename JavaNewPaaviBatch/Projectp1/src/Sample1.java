
public class Sample1 
{
	String pname="Apple";//class or instance variable
    void fun1()
    {
    	int pid=1001;//local variable
    	System.out.println(pid);
    	System.out.println(pname);
    }
    void fun2()
    {
    	System.out.println(pname);
    }
    void fun3(int empid,String empname)//Argument passing
    {
    	System.out.println("Your value is::"+empid+","+empname);
    }
	public static void main(String[] args) {
		
		Sample1 f1=new Sample1();
		f1.fun1();
		f1.fun2();
		f1.fun3(2001,"mohamed");

	}

}
