package com;
import java.util.Scanner;
public class LargNum 
{


	        public static void main(String[] args) 

	        {

	            int n, lag;

	            Scanner s = new Scanner(System.in);

	            System.out.print("Enter number of elements in the array:");

	            n = s.nextInt();

	            int a[] = new int[n];

	            System.out.println("Enter elements of array:");

	            for(int i = 0; i < n; i++)

	            {

	                a[i] = s.nextInt();

	            }

	            lag = a[0];

	            for(int i = 0; i < n; i++)

	            {

	                if(lag < a[i])

	                {

	                    lag = a[i];

	                }

	            }

	            System.out.println("Maximum value"+lag);

	        }

	    }


