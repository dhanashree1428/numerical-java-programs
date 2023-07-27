package com.jsp.logicalprograms;

import java.util.Scanner;

public class Factorial {
public int factorial(int n) {
  int fact=1;
  for( int i=1;i<=n;i++)
  {  fact=fact*i; }
  return fact;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.print("Enter the number:-");
		  int n=sc.nextInt();
		  Factorial f=new Factorial();
		  {
		 System.out.println(f.factorial(n));
		  }  
	}
}

