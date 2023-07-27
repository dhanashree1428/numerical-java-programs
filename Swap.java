package com.jsp.logicalprograms;
public class Swap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Using third variable	
    int a=10;
    int b=20;
	int temp=a;
	a=b;
	b=temp;
	System.out.println(a);
	System.out.println(b);
	
	
//Without using third variable	
	int x=50;
    int y=60;
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println(x);
	System.out.println(y);
	}
	}
	
	
    