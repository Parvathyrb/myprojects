package com;
import java.util.Scanner;
public class Largest 
{
      public static void main(String []args) {
	    int lar,n,pos=0;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter the limit ");
	    n = input.nextInt();
	    int a[] = new int[n];
	    System.out.println("Enter " + n + " numbers: ");
	    for (int i = 0; i < n; i++) {
	    a[i] = input.nextInt();
      }
	     lar=a[0];
      for (int i = 0; i <  n - 1 ; i++) {
	       if (lar < a[i]) {
    	   lar=a[i];
    	   pos=i;
	      }
	    }
	 
	    System.out.println("largestnumber is"+lar+"at location");
	    input.close();
	 
	   
	  }
	}

