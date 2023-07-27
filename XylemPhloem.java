package com.jsp.logicalprograms;

import java.util.Scanner;

public class XylemPhloem {
public static String isXylemPhloem(int n) {
	int temp=n;int count1=0;int count2=0;
    int sum1=0;int sum2=0;
    //count the no.of digits in number
    while(n>0) {
    	n=n/10;
    count1++;
    }
    //to perform sum operation
	while (temp>0) {
		int ld=temp%10;
		 count2++;
		if (count2==1 || count2==count1) {
			sum1=sum1+ld;
		}
		else {
			sum2=sum2+ld;
		}
		temp=temp/10;
	}
	if (sum1==sum2)
		{return "It is a Xylem Number.";}
	else
	{return "It is a Phloem Number.";}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.print("Enter the number:-");
		  int n=sc.nextInt();
		  System.out.println(isXylemPhloem(n));
		  }  
	}


