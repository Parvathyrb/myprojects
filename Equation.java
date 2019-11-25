

package com;
import java.util.Scanner;

public class Equation
{
public static void main(String[]args)
{

double a,b,c,r,x1=0,x2=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the a,b and c");
	 a=sc.nextDouble();
	
	 b=sc.nextDouble();
	
    c=sc.nextDouble();
	 r=Math.pow(b,2)-(4*a*c);
if(r>0)
{
   r=Math.sqrt(r);
	
	x1=(-b+Math.sqrt(r))/2*a;
	x2=(-b-Math.sqrt(r))/2*a;
}

	
	System.out.println("x1="+x1);

	System.out.println("x2"+x2);

 
{
	System.out.println("imaginary root");
}
if(r==0)
{
x1=-b/2*a;

}
System.out.println(x1);
}
}
