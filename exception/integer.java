import java.lang.*;
import java.util.*;
import java.util.InputMismatchException.*;
public class integer
{
	public static void main(String args[])
	{
		int[] a=new int[3];
		for(int i=0;i<3;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the element of"+i+":");
			int a[i]=sc.nextInt();
			}
			try{
			System.out.println("array ele is"+a[]);
	    }catch(InputMismatchException e)
		{
			System.out.println("enter integer value "+e);
		}
	
	}
}