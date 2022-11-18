package com.abstraction;
public class ExceptionPrg {
public void display()
{
	int a=10;
	int b=0;
	try 
	{
		System.out.println(a/b);
	}
	catch(Exception c)
	{
		System.out.println(c);
	}
	
	finally
	{
		System.out.println("ZZZ");
	}
}

public static void main(String args[] )
{
	 ExceptionPrg exceptionprg=new ExceptionPrg();
exceptionprg.display();
}
}