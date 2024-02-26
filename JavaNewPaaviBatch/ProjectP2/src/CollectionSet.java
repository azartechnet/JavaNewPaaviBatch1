import java.util.HashSet;

class SampleCollection
{
	HashSet<Integer>list1=new HashSet<Integer>();
	void get1()
	{
		
		list1.add(1001);
		list1.add(2001);
		list1.add(3001);
		list1.add(4001);
		list1.add(1002);
		
		System.out.println("Before Removing is::"+list1.size());
		System.out.println("Your data is::"+list1);
		System.out.println("Searching data is::"+list1.contains(1001));
		System.out.println("Removing the data is::"+list1.remove(1001));
		System.out.println("After Removing Searching data is::"+list1.contains(1001));
		System.out.println("After Removing is::"+list1.size());
	}
}
public class CollectionSet {

	public static void main(String[] args) {
	
		SampleCollection f1=new SampleCollection();
		f1.get1();

	}

}
