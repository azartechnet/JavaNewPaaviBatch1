import java.util.HashSet;
import java.util.Iterator;

public class CollectionP1 {

	HashSet<Integer>list1=new HashSet<Integer>();
	void get1()
	{
		list1.add(1001);
		list1.add(2001);
		list1.add(2002);
		list1.add(1001);
		System.out.println("Your list is::"+list1);
		System.out.println("Searching is::"+list1.contains(1001));
		System.out.println("Removing is::"+list1.remove(2001));
		System.out.println("Total size is::"+list1.size());
		Iterator h1=list1.iterator();
		while(h1.hasNext())
		{
			System.out.println(h1.next());
		}
	}
	public static void main(String[] args) {
		
		CollectionP1 f1=new CollectionP1();
		f1.get1();
	}

}
