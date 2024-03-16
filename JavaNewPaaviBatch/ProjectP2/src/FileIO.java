import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;

public class FileIO {

	void writeData() throws IOException
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("D:\\s1.txt");
			String name="welcome";
			byte s[]=name.getBytes();
			fos.write(s);
			System.out.println("FileInserted..");
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	void readData() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\s1.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	void seqInputStream() throws IOException
	{
		try
		{
			FileInputStream fis1=new FileInputStream("D:\\s1.txt");
			FileInputStream fis2=new FileInputStream("D:\\s2.txt");
			SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
			int i;
			while((i=sis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	void fileWriter() throws IOException
	{
		try
		{
			FileWriter fw=new FileWriter("D:\\s1.txt");
			fw.write("Welcome");
			System.out.println("FileInserted..");
			fw.close();
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	void fileReader() throws IOException
	{
		try
		{
			FileReader fr=new FileReader("D:\\s1.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t)
		{
			
		}
		finally
		{
			
		}
	}
	void trywith() throws IOException
	{
		try(FileOutputStream fos=new FileOutputStream("D:\\s1.txt");)
		{
			String name="welcome";
			byte s[]=name.getBytes();
			fos.write(s);
			System.out.println("FileInserted..");
		}
		catch(FileNotFoundException t)
		{
		
		}
	}
	public static void main(String[] args) throws IOException {
		
		FileIO f1=new FileIO();
		//f1.writeData();
		//f1.readData();
		//f1.seqInputStream();
		//f1.fileWriter();
		//f1.fileReader();

	}

}
