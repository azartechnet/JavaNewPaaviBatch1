class Demo21
{
	public <M>M test(M t)
	{
		return t;
	}
//	public int test(int t)
//	{
//		
//	}
}
public class GenericMethod {

	public static void main(String[] args) {
		
		Demo21 g1=new Demo21();
		System.out.println(g1.test(1001));
		System.out.println(g1.test("azar"));
		System.out.println(g1.test(2.4));
		

	}

}
