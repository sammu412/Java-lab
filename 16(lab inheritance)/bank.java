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
class bank
{
int acc_num;
String branch_name;
String bank_name;
String ifsc_code; 
int balance;
bank(int acc,String br,String ba,String i,int bal)
{
	this.acc_num=acc;
	this.branch_name=br;
	this.bank_name=ba;
	this.ifsc_code=i;
	this.balance=bal;
}
	public void bank()
	{
		System.out.println("acc_num:"+this.acc_num);
		System.out.println("branch_name:"+this.branch_name);
		System.out.println("bank_name:"+this.bank_name);
		System.out.println("ifsc_code:"+this.ifsc_code);
		System.out.println("balance:"+this.balance);
	}
}
class bankinfo
{
	public static void main(String args[])
	{
		//bank s3=new bank();
		//s3.bank(34563,"melur","indian bank","SGTEFJ78F",4875);
		//s3.edu(70,80,90,77,98);
		//s3.display("sammu","sammu12@gmail.com",1234567890,"madurai");
		personal s1=new personal("sammu","sammu12@gmail.com",1234567890,"madurai");
		s1.display();
		education s2=new education(70,80,90,77,98);
		s2.edu();
		bank s3=new bank(34563,"melur","indian bank","SGTEFJ78F",4875);
		s3.bank();
		
	}
}