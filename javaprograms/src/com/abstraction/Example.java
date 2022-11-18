package com.abstraction;
public class Example implements Name {
		// TODO Auto-generated method stub
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}
public void abd()
{
System.out.println("none");
}
public static void main( String args[])
{
Example example=new Example();
example.abc();
example.abd();
}
}
