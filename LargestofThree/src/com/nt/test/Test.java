package com.nt.test;

public class Test {

	public static void main(String[] args) {
		int a=100,b=35,c=35;
		int larg=0;
		larg=(a>b?a:b)>c?(a>b?a:b):c;
		System.out.println("Largest is"+larg);

	}

}
