class Demo20<M>
{
	public M t;  
	
	public void get1(M t)
	{
		System.out.println("Your value is::"+t);
	}
}


public class GenericClass {

	public static void main(String[] args) {
		
		Demo20<Integer>f1=new Demo20();
		f1.get1(1001);
		Demo20<String>f2=new Demo20();
		f2.get1("mohamed");

	}

}
