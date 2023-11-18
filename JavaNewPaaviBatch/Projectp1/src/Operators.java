import java.util.Scanner;

class Sample12
{
	int a2,b2;
	Scanner sc=new Scanner(System.in);
	void arithmeticOperator()
	{
		int a1=20,b1=10;
		System.out.println("Addition::"+(a1+b1));
		System.out.println("Sub::"+(a1-b1));
		System.out.println("Multiple::"+(a1*b1));
		System.out.println("Division is::"+(a1/b1));
		System.out.println("Module::"+(a1%b1));
	}
	void relationOperator()
	{
		//int a2=20,b2=10;
		System.out.println("Enter the a2 and b2 value is::");
		a2=sc.nextInt();
		b2=sc.nextInt();
		System.out.println("Lessthan::"+(a2<b2));
		System.out.println("Greaterthan::"+(a2>b2));
		System.out.println("Equal to::"+(a2==b2));
		System.out.println("Not Equal to::"+(a2!=b2));
		//System.out.println(a2>b2);
	}
}
public class Operators {

	public static void main(String[] args) {
		
		Sample12 f1=new Sample12();
		//f1.arithmeticOperator();
		f1.relationOperator();
	}

}
