
public class OperatorP1 {

	
	void arithmeticOperators()
	{
		int a1=100,b1=200;
		System.out.println("Add::"+(a1+b1));
		System.out.println("Mul::"+(a1*b1));
		System.out.println("Div::"+(a1/b1));
		System.out.println("Module::"+(a1%b1));
	}
	void comparisionOperator()
	{
		int a2=200,b2=100;
		System.out.println("Lessthan::"+(a2<b2));
		System.out.println("Greaterthan::"+(a2>b2));
		System.out.println("Equal to::"+(a2==b2));
		System.out.println("NotEqual to::"+(a2!=b2));
	}
	void LogicalOperator()
	{
		int a3=3,b3=2;
		System.out.println("LogicalAND::"+((a3>b3)&&(b3<a3)));//True
		System.out.println("LogicalOR::"+((a3<b3)||(b3<a3)));//True
		System.out.println("LogicalNOT::"+(!(a3>b3)));//False
	}
	void bitwiseOperator()
	{
		int a=2,b=3;
//		System.out.println("BitWiseAND::"+(a&b));
//		System.out.println("BitWiseOR::"+(a|b));
		System.out.println("LeftShift::"+(a<<2));
		System.out.println("RightShift::"+(a>>1));
		System.out.println("XOR::"+(a^b));
	}
	public static void main(String[] args) {
		
		OperatorP1 f1=new OperatorP1();
		//f1.arithmeticOperators();
		//f1.comparisionOperator();
		//f1.LogicalOperator();
		f1.bitwiseOperator();

	}

}
