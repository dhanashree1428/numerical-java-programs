package com.jsp.logicalprograms;

import java.util.Scanner;

public class PrimeNumbers {
	public static boolean primeNumbers(int n) {
		int count=0;
		for ( int i=1;i<=n;i++)
			if(n%i==0)
			{	count++;}
		{if (count==2)
			return true;
		else 
			return false;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the number:-");
   int n=sc.nextInt();
   boolean result=primeNumbers(n);
   System.out.println(result);
   
	}

}
