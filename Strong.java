package com.jsp.logicalprograms;

import java.util.Scanner;

public class Strong {
		public static boolean isStrong(int n) {
			int sum=0;int temp=n;
			while(n>0)
	   	  {
			int ld=n%10;
			int fact=1;
			while (ld>0)
			{
		  fact=fact*ld;
		  ld--;
			}
			sum=sum+fact;
			n=n/10;}
			if (sum==temp)
					{return true;}
				else {return false;}
			}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      Scanner sc=new Scanner(System.in);
		    System.out.print("Enter the number:-");
		    int n=sc.nextInt();
		    System.out.println(isStrong(n));
}
}
