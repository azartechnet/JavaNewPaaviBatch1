interface Product
{
	int pid=1001;
	void addProduct();
}
interface Category extends Product
{
	int cid=2001;
	void addCategory();
}
class Sample12 implements Category
{

	public void addProduct() {
		
		System.out.println("Its is Product Interface::"+pid);
		
	}
	public void addCategory()
	{
		System.out.println("Your category cid is::"+cid);
	}
	
}
public class Demo {

	public static void main(String[] args) {
		
		Sample12 f1=new Sample12();
		f1.addProduct();
		f1.addCategory();

	}

}
