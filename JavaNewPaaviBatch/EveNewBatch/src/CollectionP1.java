import java.util.HashSet;

class Sample
{
	HashSet<Integer>list1=new HashSet();
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
	}
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
public class CollectionP1 {

	public static void main(String[] args) {
		
		Sample d1=new Sample();
		d1.get1();

	}

}
