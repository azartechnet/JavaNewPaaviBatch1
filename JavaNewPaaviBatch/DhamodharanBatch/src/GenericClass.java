class Demo15<T>
{
	void get1(T t)
	{
		System.out.println("Its is get method"+t);
	}
	
}
public class GenericClass {

	public static void main(String[] args) {
		
		Demo15<Integer> f1=new Demo15<Integer>();
		f1.get1(1001);
		Demo15<String> f2=new Demo15<String>();
		f2.get1("mohamed");

	}

}
