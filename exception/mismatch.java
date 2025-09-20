import java.lang.*;
import java.util.*;
import java.util.InputMismatchException.*;
public class mismatch
{
	public static void main(String args[])
	{
		
			Scanner sc=new Scanner(System.in);
			try{
			int a=sc.nextInt();
			int b=sc.nextInt();
			double x=a/b;
			System.out.println("division "+x);
	    }
		catch(ArithmeticException e)
		{
		System.out.println("enter non zero value"+e);	
		}catch(InputMismatchException e1)
		{
		System.out.println("enter integer value"+e1);
		}
		
	}
}