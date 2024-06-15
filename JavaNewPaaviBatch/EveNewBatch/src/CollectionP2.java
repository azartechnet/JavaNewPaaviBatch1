import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class Sample4
{
	ArrayList<Integer>list1=new ArrayList<Integer>();
	void get1()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(1004);
		list1.add(1004);
		System.out.println("Your data is::"+list1);
		
		System.out.println("Your size is::"+list1.size());
		
		System.out.println("Searching.."+list1.contains(1001));
		
		System.out.println("Removing is::"+list1.remove(1001));
		
		System.out.println("After Remove the data is::"+list1);
		Iterator f1=list1.iterator();
		while(f1.hasNext())
		{
			System.out.println("Your Inside loop data is::"+f1.next());
		}
	}
}
public class CollectionP2 {

	public static void main(String[] args) {
		
		Sample4 f1=new Sample4();
		f1.get1();

	}

}
