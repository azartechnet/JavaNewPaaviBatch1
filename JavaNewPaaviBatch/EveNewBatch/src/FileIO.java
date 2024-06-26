import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {

	
	void writeData() throws IOException
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("D:\\t1.txt");
			String s1="welcome";
			byte f[]=s1.getBytes();
			fos.write(f);
			System.out.println("FileInserted...");
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	public static void main(String[] args) throws IOException {
		
		FileIO f1=new FileIO();
		f1.writeData();

	}

}
