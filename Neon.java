package com.jsp.logicalprograms;

import java.util.Scanner;

public class Neon {
	public static boolean isNeon(int n) {
	int sq=n*n;
	int sum=0;
	  while (sq>0)
	  {
	int ld=sq%10;
	 sum=sum+ld;
		sq=sq/10;
		}
	  if (sum==n) {
		  return true;}
	  else { return false;
	  }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      Scanner sc=new Scanner(System.in);
		    System.out.print("Enter the number:-");
		    int n=sc.nextInt();
		    System.out.println(isNeon(n));
}
}
