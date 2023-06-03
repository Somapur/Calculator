package com.ty.firstprgrm;

import java.util.Scanner;

class calculator
{
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public static void mul(int a,int b)
	{
		System.out.println( a*b);
	}
	public static void div(int a,int b)
	{
		System.out.println(a/b);
	}
}
public class Simple 
{
	public static void main(String[] args) 
	{
		calculator.add(5, 6);
		calculator.sub(20,1);
		calculator.mul(6, 5);
		calculator.div(20,10);
		
	}
}
