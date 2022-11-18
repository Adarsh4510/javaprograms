package com.abstraction;
public class Age {
public void vote()
{
	int a=17;

		if(a>=18)
		{
			System.out.println("eligblity to vote");
		}
		else {
		throw new ArithmeticException("not eligible");		

	}}
public static void main(String[] args) {
	Age age=new Age();
	age.vote();
	}
}



