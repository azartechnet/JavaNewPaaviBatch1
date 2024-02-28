import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class Demo18
{
	ArrayList<Integer>list1=new ArrayList<Integer>();
	void get1()
	{
		
		list1.add(1001);
		list1.add(2001);
		list1.add(2001);
		list1.add(4001);
		list1.add(1002);
		
		Iterator<Integer> h1=list1.iterator();
		
		while(h1.hasNext())
		{
			System.out.println("Your loop inside data is::"+h1.next());
		}
		
		System.out.println("Before Removing is::"+list1.size());
		System.out.println("Your data is::"+list1);
		System.out.println("Searching data is::"+list1.contains(1001));
//		//System.out.println("Removing the data is::"+list1.remove(1001));
		System.out.println("After Removing Searching data is::"+list1.contains(1001));
		System.out.println("After Removing is::"+list1.size());
	}
}
public class ArrayListP1 {

	public static void main(String[] args) {
		
		Demo18 f1=new Demo18();
		f1.get1();
		

	}

}
