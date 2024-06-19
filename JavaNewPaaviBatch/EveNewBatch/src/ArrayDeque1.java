import java.util.ArrayDeque;

class Sample19
{
	ArrayDeque<Integer>g1=new ArrayDeque();
	void get1()
	{
		g1.addFirst(1001);
		g1.add(1002);
		g1.addLast(2001);
		
		System.out.println("Your value is::"+g1);
		System.out.println("Remove the data is::"+g1.remove());
		System.out.println("RetainAll is::"+g1.retainAll(g1));
	}
}
public class ArrayDeque1 {

	public static void main(String[] args) {
		
		Sample19 g1=new Sample19();
		g1.get1();

	}

}
