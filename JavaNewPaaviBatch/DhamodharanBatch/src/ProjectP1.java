import java.io.DataInputStream;
import java.io.IOException;

class Sample
{
	int empid;
	String empname;
	DataInputStream dis=new DataInputStream(System.in);
	void input() throws  IOException
	{
		System.out.println("Enter the empid is::");
		empid=Integer.parseInt(dis.readLine());
		System.out.println("Enter the empname is::");
		empname=dis.readLine();
	}
	void display()
	{
		System.out.println("Your value is::"+empid+""+empname);
	}
}
public class ProjectP1 {

	public static void main(String[] args) throws IOException {
		
		Sample s1=new Sample();
		s1.input();
		s1.display();

	}

}
