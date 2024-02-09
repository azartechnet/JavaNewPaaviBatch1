
public class ProductImpl implements ProductDAO
{

	public void addProduct(ProductModel p) {
		
		System.out.println("Your Product Id is::"+p.getPid());
		System.out.println("Your Product Name is::"+p.getPname());
		
	}

	
	

}
