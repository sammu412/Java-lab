import java.util.*;
import java.util.InputMismatchException.*;
import java.io.*;
public class cound
{
 public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter a string");
	  String str=sc.next();
	  char[] chars=str.toCharArray();
      int count=0;
	  int cons=0;
	  for(char c:chars)
	  {
	  if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
	  {
		  count++;
	  }
	  else
	  {
		  cons++;
	  }
	  }
	  System.out.println("number of vowels "+count);
	  System.out.println("number of consonants "+cons);
  }
}