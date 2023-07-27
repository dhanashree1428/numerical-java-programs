package com.jsp.logicalprograms;

import java.util.Scanner;

public class Spy {
	public static boolean isSpy(int n) {
	int sum=0;int pro=1;
	while (n>0) {
		int ld=n%10;
		sum=sum+ld;
		pro=pro*ld;
		n=n/10;
		}
		if (sum==pro)
		   {return true;}
	    else
	       {return false;}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
	      Scanner sc=new Scanner(System.in);
			    System.out.print("Enter the number:-");
			    int n=sc.nextInt();
			    System.out.println(isSpy(n));
	}

}
