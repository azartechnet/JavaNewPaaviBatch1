import java.util.*;
import java.util.Map.Entry;

class Foo12
{
	HashMap<Integer,String>list1=new HashMap<Integer,String>();
	void get1()
	{
		list1.put(1001,"a1");
		list1.put(1002,"a2");
		list1.put(1003,"a3");
		
		for(Entry<Integer, String> h1:list1.entrySet())
		{
			System.out.println(h1.getKey());
			System.out.println(h1.getValue());
		}
		
		System.out.println("Searching the data is::"+list1.containsKey(1001));
		System.out.println("Removing the data is::"+list1.remove(1002));
		System.out.println("Total size of the key is::"+list1.size());
		System.out.println("After Removing the data is::"+list1);
		
		System.out.println("Your value is::"+list1);
	}
}
public class Map {

	public static void main(String[] args) {
		
		Foo12 f1=new Foo12();
		f1.get1();
		
	}

}
