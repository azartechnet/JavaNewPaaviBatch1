import java.io.DataInputStream;
import java.io.IOException;

class Demo
{
	int productid,productprice;
	String productname;
	DataInputStream dis=new DataInputStream(System.in);
	void input() throws NumberFormatException, IOException
	{
	   System.out.println("Enter the ProductId and ProductPrice::");
	   productid=Integer.parseInt(dis.readLine());
	   productprice=Integer.parseInt(dis.readLine());
	   System.out.println("Enter the ProductName is::");
	   productname=dis.readLine();
	}
	void display()
	{
		System.out.println("Your ProductId is::"+productid);
		System.out.println("Your ProductName is::"+productname);
		System.out.println("Your ProductPrice is::"+productprice);
	}
}
public class DataInputStreamP1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Demo f1=new Demo();
		f1.input();
		f1.display();

	}

}
