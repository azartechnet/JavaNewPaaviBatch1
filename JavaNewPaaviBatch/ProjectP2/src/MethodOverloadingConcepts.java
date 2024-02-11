class Sample14
{
	void get1(int p1,int p2)
	{
		System.out.println("Your value is::"+p1+""+p2);
	}
	void get1(int s1,float s2)
	{
		System.out.println("Your value is::"+s1+""+s2);
	}
}
public class MethodOverloadingConcepts {

	public static void main(String[] args) {
		
		Sample14 f1=new Sample14();
		f1.get1(100,200);
		f1.get1(300,2.56f);

	}

}
