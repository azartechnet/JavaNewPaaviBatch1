import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		int i,j;
		int empid[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		for(i=0;i<=100;i++)
		{
			for(j=0;j<=5;j++)
			{
				System.out.println("Enter the empid is::");
	            empid[i][j]=sc.nextInt();
				System.out.println("I value is::"+i+"J value is::"+j);
			}
		}

	}

}
