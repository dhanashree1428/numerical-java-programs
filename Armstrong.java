package com.jsp.logicalprograms;

import java.util.Scanner;

public class Armstrong {
public static boolean isArmstrong(int n) {
	int z=n;int count=0;int sum=0;
	//count the no.of digits in number
	while(z>0) {
		z=z/10;
		count++;
	}
	z=n;
	while(z>0) {
		int ld=z%10;
		int pro=1;
		for(int i=1;i<=count;i++) {
		pro=pro*ld;
	 } 
		sum=sum+pro;
		z=z/10;
		}
	if (sum==n)
		{return true;}
	else
		{return false;}
}
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number:-"); 
	int n=sc.nextInt();
	System.out.println(isArmstrong(n));
	}

}
