package com.jsp.logicalprograms;

import java.util.Scanner;

public class Perfect {
	public static boolean isPerfect(int n) {
  int i;
  int sum=0;
  for(i=1;i<n;i++)
   if (n%i==0)
{
  sum=sum+i;
  }
   if (sum==n)
   {
	  return true;
   }
   else 
	    return false;
  }	
  	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:-");
    int n=sc.nextInt();
    System.out.println(isPerfect(n));
		}
}
