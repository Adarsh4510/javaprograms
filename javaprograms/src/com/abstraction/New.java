package com.abstraction;
public class New {
public void display()
{
	int a=10;
	int b=0;
	try 
	{
		System.out.println(a/b);
	}
	catch(ArrayIndexOutOfBoundsException  c)
	{
		System.out.println(c);
	}
	catch( ArithmeticException e)
	{
	System.out.println("e");
}
	catch(Exception e)
	{
		System.out.println("e");
	}
	finally
	{
		System.out.println("ZZZ");
	}
}

public static void main(String args[] )
{
New new1=new New();
new1.display();
}
}
