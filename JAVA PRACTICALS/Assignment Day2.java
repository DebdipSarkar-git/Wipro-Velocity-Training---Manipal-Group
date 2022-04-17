//1. Casting and Arithmetic Operators

public class Main
{
	public static void main(String[] args) {
		int a = 10;
		double b = a; // Automatic (int to double)
		System.out.println(a);
		double d = 7.897;
		int e = (int) d; // Manual
		System.out.println(e);
		int s =5;
		s >>=6;
		int p =7;
		p <<=6;
		System.out.println(s);
		System.out.println(p);
		int f = 2, h=6;
		int i = f+h;
		int j = h-f;
		int k = f*h;
		int l = h/f;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(e);
	}
}

//2. Switch Case

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int rn = (int)(Math.random()*51);
		System.out.println(rn);
	char ch;
    double a, b, result;
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose an operator: +, -, *, or /");
    ch = sc.next().charAt(0);
    System.out.println("Enter first number");
    a = sc.nextDouble();
    System.out.println("Enter second number");
    b = sc.nextDouble();
    switch (ch) {
      case '+':
        result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        break;
      case '-':
        result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        break;
      case '*':
        result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        break;
      case '/':
        result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

	}
}

// 3. While loop

public class Main
{
	public static void main(String[] args) {
		int rows = 7;
		int i = 1 ;
		while( i <= 7) 
		{
			int j = 0 ; 
			while(j < 7 - i ) 
			{
				System.out.print(" ");
				j++;
			}
			int k = 0 ; 
			while(k < (i * 2) - 1) 
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
	}
}


// 4. For Loop

public class Main
{
	public static void main(String[] args) {
		int n = 7;
		for(int i=1;i<=7;i++)
               {
	        for(int j=0;j<7-i;j++)
                
                       {
                               System.out.print(" ");
                       }
                       for(int j=0;j<(i*2)-1;j++)
                
                       {
                               System.out.print("*");
                       }
                      System.out.println();
               }             
                
    }
}

// 5. Array 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the array size:");
	    int n = sc.nextInt();
	    int [] arr = new int[n];
	    System.out.println("Enter the array elements:");
	    int i;
	    for(i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
		System.out.println(arr[5]);
		
		System.out.println("The array elements are:");
		for(i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}

// 6. Functions

public class Main
{
    static void fun(int l, int b){
        int area = l*b;
        System.out.println("Area of rectangle is :"+area);
    }
	public static void main(String[] args) {
	    int a =5;
	    int b=4;
		fun(5,4);
	}
}

// 7. Function Overloading

public class Main
{
		static int f1(int a, int b){
		    return a+b;
		}
		static double f2(double a, double b){
		    return a-b;
		}
		public static void main(String[] args){
		    int a = f1(2,3);
		    double d = f2(4.5,3.5);
		    System.out.println(a);
		    System.out.println(d);
		}
}

// 8. Objects

public class Main
{
    int a=3;
	public static void main(String[] args) {
		Main o1 = new Main();
		Main o2 = new Main();
		System.out.println(o1.a);
		System.out.println(o2.a);
	}
}

// 9. User Input

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number");
		int c = sc.nextInt();
		int d = a+b+c;
		System.out.println("Result is:"+d);
	}
}

// 10. Take 10 Integers from user using loop (for/While) and print the square root of the sum.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 integers:");
		int i,s=0;
		for(i=1;i<=10;i++){
		    i=sc.nextInt();
		    s+=i;
		}
		double d = Math.sqrt(s);
		System.out.println(d);
	}
}

// 11. Print table of 13

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number:");        
	int n=sc.nextInt();
    for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
 
