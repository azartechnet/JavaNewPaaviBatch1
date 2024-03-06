class Demo16
{
    public <M> M get(M s1)
	{
		return s1;
	}
}
public class GenericMethod {

	public static void main(String[] args) {
		
		Demo16 f1=new Demo16();
		System.out.println(f1.get("azar"));
		System.out.println(f1.get(123));
		System.out.println(f1.get(2.5));
		

	}

}
