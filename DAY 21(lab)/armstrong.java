import java.util.*;
import java.util.InputMismatchException.*;
import java.io.*;
public class armstrong
{
 public static void main(String args[])
  {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter a number:");
	 int arm=sc.nextInt();
	 double org=arm;
	 double check=0;
	 while(arm>0)
	 {
		 double temp=arm%10;
		 check=check+(Math.pow(temp,3));
		 arm=arm/10;
	 }
	 if(org==check)
	 {
		 System.out.println("the number is armstrong");
	 }
	 else{
		  System.out.println("the number is not armstrong");
	 }
  }
} 
 
      
	  