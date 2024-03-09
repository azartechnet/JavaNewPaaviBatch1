import java.util.Map.Entry;
import java.util.TreeMap;

public class MapConcepts {

	TreeMap<Integer,String>g1=new TreeMap<Integer,String>();
	
	void get1()
	{
	    g1.put(1001,"azar");
	    g1.put(1002, "mohan");
	    g1.put(1003, "raja");
	    g1.put(1004, "sheik");
	    
	    for(Entry<Integer, String> m:g1.entrySet())
	    {
	    	System.out.println("Your key is::"+m.getKey()+"Your value is::"+m.getValue());;
	    }
	   System.out.println("Your size of the data::"+g1.size());
	   System.out.println("Remove the data is::"+g1.remove(1001));
	   System.out.println("Searching the data is::"+g1.containsKey(1001));
	   System.out.println("After Removing the data is::"+g1.size());
	}

	public static void main(String[] args) {
		
		MapConcepts f1=new MapConcepts();
		f1.get1();

	}



}
