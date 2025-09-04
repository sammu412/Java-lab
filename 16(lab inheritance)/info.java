import java.util.*;
import java.lang.*;
class personal
{
String name;
String mail;
int mobile;
String address; 
personal(String n,String m,int mo,String a)
{
	this.name=n;
	this.mail=m;
	this.mobile=mo;
	this.address=a;
}
	public void display()
	{
		System.out.println("name:"+this.name);
		System.out.println("mail:"+this.mail);
		System.out.println("mobile:"+this.mobile);
		System.out.println("address:"+this.address);
	}
}
class education
{
	int tamil;
	int english;
	int maths;
	int science;
	int social;
	education(int t,int e,int m,int s,int ss)
	{
	this.tamil=t;
	this.english=e;
	this.maths=m;
	this.science=s;
	this.social=ss;
	}
	public void edu()
	{
		System.out.println("tamil:"+this.tamil);
		System.out.println("english:"+this.english);
		System.out.println("maths:"+this.maths);
		System.out.println("science:"+this.science);
		System.out.println("social:"+this.social);
		int total=(tamil+english+maths+science+social);
		System.out.println("total:"+total);
		double persent=total/5;
		System.out.println("percentage:"+persent+"%");
	}
}
public class info
{
	public static void main(String args[])
	{
		personal s1=new personal("sammu","sammu12@gmail.com",1234567890,"madurai");
		s1.display();
		education s2=new education(70,80,90,77,98);
		s2.edu();
		
	}
}