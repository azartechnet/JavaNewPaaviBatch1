
public class MainClass {

	public static void main(String[] args) {
		
		ProductModel p=new ProductModel();
		p.setPid(1001);
		p.setPname("apple");
		
		ProductImpl pl=new ProductImpl();
		pl.addProduct(p);
	}

}
