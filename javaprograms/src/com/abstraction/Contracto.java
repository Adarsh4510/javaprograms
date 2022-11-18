package com.abstraction;
import java.util.Scanner;
public class Contracto extends Employee{
	@Override
	public void display(int a) {
int salary=a*100;
System.out.println("Total salary= "+salary);
		// TODO Auto-generated method stub
}
public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
Contracto contracto=new Contracto();
System.out.println("a.partime employee");
System.out.println("b.fulltime employee");
System.out.println("enter your designation");
String ch=sc.nextLine();
switch(ch) {
case "a":
System.out.println("enter your working hour");
int a=sc.nextInt();
contracto.display(a);
break;
case "b":
final int b=8;
contracto.display(b);
break;
default:
System.out.println("invalid");
}
}
}

