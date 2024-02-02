
public class StringvsNewString {

	public static void main(String[] args) {
		
		String s1="welcome";
		String s2="welcome";
		
		
		String s3=new String("welcome");
		String s4=new String("welcome");
		System.out.println("Withoutcreating object::"+s1.equals(s2));
		System.out.println(s3==s4);

	}

}
