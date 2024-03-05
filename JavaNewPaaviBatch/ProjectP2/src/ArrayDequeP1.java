import java.util.ArrayDeque;

class ArrayP1
{
	ArrayDeque<Integer>list1=new ArrayDeque<Integer>();
	void get1()
	{
		list1.add(1001);
		list1.addFirst(2001);
		list1.addLast(3001);;
		list1.add(2002);
		
		System.out.println("Your value is::"+list1);
		System.out.println("Remove first::"+list1.removeFirst());
		System.out.println("Searching the data is::"+list1.contains(1001));
	}
}
public class ArrayDequeP1 {

	public static void main(String[] args) {
		
		ArrayP1 f1=new ArrayP1();
		f1.get1();

	}

}
