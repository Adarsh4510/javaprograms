package com.abstraction;
import java.util.Scanner;
public class Hdfc implements Rbi {
public void recurringdeposite(int a,int b)
{
	double d=(a*b)*intrest;
	System.out.println("total amount="+d);
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the deposit amount");
int deposite=sc.nextInt();
System.out.println("enter the month");
int year=sc.nextInt();
Hdfc hdfc=new Hdfc();
hdfc.recurringdeposite(deposite,year);
}
}
