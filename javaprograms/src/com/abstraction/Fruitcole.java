package com.abstraction;
public class Fruitcole implements Fruits {

		// TODO Auto-generated method stub
@Override
public void colors( ) {
System.out.println("red");
System.out.println("blue");
System.out.println("green");
	}
@Override
public void Fruit() {
	System.out.println("apple");
	System.out.println("mango");
	System.out.println("orange");
	// TODO Auto-generated method stub
}
public static void main(String[] args) {
Fruitcole fruitcol=new Fruitcole();
fruitcol.colors();
fruitcol.Fruit();
}
}
