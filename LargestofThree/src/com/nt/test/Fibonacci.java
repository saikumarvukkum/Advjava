package com.nt.test;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,sum=0;
		for(int i=0;i<=6;i++) {
			sum=a+b;
			
			System.out.print(sum+ " ");
			a=b;
			b=sum;
		}

	}

}
