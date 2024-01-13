import java.util.Scanner;

public class IfelseStatement 
{
	
   int salary;
   Scanner sc=new Scanner(System.in);
   void get1()
   {
	   System.out.println("Enter the salary is::");
	   salary=sc.nextInt();
	   
   }
   void get2()
   {
	   if(salary>=2000)
	   {
		   System.out.println("Good");
	   }
	   else
	   {
		   System.out.println("Better");
	   }
   }
   void get3()
   {
	   int a;
	   System.out.println("Enter the a value is::");
	   a=sc.nextInt();
	  if(a%2==0)
	  {
		  System.out.println("Its Even"+a);
	  }
	  else
	  {
		  System.out.println("Its Odd"+a);
	  }
   }
   void get4()
   {
	   int age,bns;
	   System.out.println("Enter the age is::");
	   age=sc.nextInt();
	   if(age>=61)
	   {
		   System.out.println("Enter the salary is::");
		   salary=sc.nextInt();
		   if(salary>=2000)
		   {
			   bns=salary+500;
			   System.out.println("Your salary is::"+bns);
		   }
		   else
		   {
			  bns=salary+1000;
			  System.out.println("Your salary is::"+bns);
		   }
	   }
	   else
	   {
		   System.out.println("Your age is low");
	   }
   }
   void get5()
   {
	   int exp;
	   System.out.println("Enter the expression::");
	   exp=sc.nextInt();
	   switch(exp)
	   {
	   case 1:
		   System.out.println("Case-1");
		   break;
	   case 2:
		   System.out.println("Case-2");
		   break;
	   default:
		   System.out.println("default Case");
	   }
   }
	public static void main(String[] args) {
	
		IfelseStatement obj1=new IfelseStatement();
		//obj1.get1();
		//obj1.get2();
		//obj1.get3();
		//obj1.get4();
		obj1.get5();

	}

}
