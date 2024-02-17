class Product
{
	Product()//default constructor
	{
		System.out.println("Its is default const...");
	}
	Product(int a)//param constructor
	{
		System.out.println("Its param cons...."+a);
	}
	void get1()
	{
		System.out.println("Its is Normal method..");
	}
}
public class Constructor {

	public static void main(String[] args) {
		
		new Product();//default const
		
		Product p1=new Product(1001);//param const
		p1.get1();

	}

}
