enum empname{mohamed,azar,raja};
public class EnumConcepts {

	public static void main(String[] args) {
		
		for(empname e1:empname.values())
		{
			System.out.println("Your Employee details is::"+e1);
		}

	}

}
