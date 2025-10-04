import java.util.*;
import java.util.InputMismatchException.*;
import java.io.*;
public class pali
{
 public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String str=sc.next();
	String org_str=str;
	int len=org_str.length();
	String rev="";
    for(int i=len-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}		
	System.out.println(rev);
	if(org_str.equals(rev))
	{
		System.out.println("pali");
	}
	else
	{
		System.out.println("not pali");
	}
	
  }
}