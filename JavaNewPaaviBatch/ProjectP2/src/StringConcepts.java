
public class StringConcepts {

	public static void main(String[] args) {
		
		String s1="admin";
		String s2=new String("admin");
		System.out.println("S1 value is::"+s1);
		System.out.println("S2 value is::"+s2);
		System.out.println("S1 length is::"+s1.length());
		System.out.println("S1 value CharAT::"+s1.charAt(2));
		System.out.println("Equal of Concepts");
		if(s1.equals("admin")&&s2.equals("admin"))
		{
			System.out.println("LoginSucess!!!");
		}
		else
		{
			System.out.println("LoginFail!!!");
		}

	}

}
