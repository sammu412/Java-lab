import java.lang.*;
import java.util.*;
import java.util.InputMismatchException.*;
public class atm
{
	public static void main(String args[])
	{
		
			Scanner sc=new Scanner(System.in);
			try{
				System.out.println("enter the amount to withdraw");
			int a=sc.nextInt();
			System.out.println("get the cash ");
	    }
		catch(InputMismatchException e1)
		{
		System.out.println("please enter amount integer"+e1);
		}
		
			
		
	}
}