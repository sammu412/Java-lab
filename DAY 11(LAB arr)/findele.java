import java.util.*;
class findele
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] a={32,54,67,90,32};
		System.out.print("enter element:");
		int b=sc.nextInt();
		boolean found=false;
		for(int num : a)
		{
			if(num==b)
			{
			found=true;
			break;
			}
		}
		 if(found)
		 {
		 System.out.print("element is present:"+b);	
		 }
		
		 else
		 {
		 System.out.print("element is not found:"+b);
		 }
	
	}
}