package com.jsp.logicalprograms;

import java.util.Scanner;

public class Reverse {
public static int reverseNumber(int n) {
	int rev=0;
	while(n>0) {
	int lastdigit=n%10;
	rev=rev*10+lastdigit;
	n=n/10;
	}
	return rev;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number:-");
  int n=sc.nextInt();
  int result=reverseNumber(n);
  System.out.println(result);
	}

}
