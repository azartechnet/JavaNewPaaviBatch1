
public class Exception1
{
   void get1()
   {
	   try
	   {
	   int a=100/0;
	   System.out.println("Your value is::"+a);
	   }
	   catch(ArithmeticException t)
	   {
		   System.out.println("Please check the value"+t);
	   }
	   get2();
   }
   void get2()
   {
	   System.out.println("This is get2 function");
   }
   void get3()
   {
	   try
	   {
		   //String name="mohamed";
		   String name=null;
		   System.out.println("Your value is::"+name.length());
	   }
	   catch(NullPointerException t)
	   {
		   System.out.println("Please check the value "+t);
	   }
   }
	public static void main(String[] args) {
		
		Exception1 f1=new Exception1();
		//f1.get1();
		f1.get3();

	}

}
