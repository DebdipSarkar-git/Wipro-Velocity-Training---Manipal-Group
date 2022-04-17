//1. Hello World 

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}



//2. Area of a Square

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of square:");
		double a = sc.nextDouble();
		System.out.println("Area of square: "+a*a);
	}
}


//3. Arithmetic, Assignment, Comparison, Logical
 

class Main {
    public static void main(String[] args) {
      int a = 11;
      int b = 7;
      //Arithmetic Operator
      int c = a+b;
      System.out.println("Result: "+c);
      //Assignment Operator
      int d = 24;
      System.out.println("Result: "+d);
      // Comparison Operator
      System.out.println(a>b);
      //Logical Operator
      System.out.println((5>3) && (12>8));
    }
}

//4. String Program

class Main {
    public static void main(String[] args) {
       String s="Hi my name is Debdip";
       String a="Debdip";
       String b="Sarkar";
       System.out.println("length of the string: "+s.length());
       System.out.println(s.toUpperCase());
       System.out.println(s.toLowerCase());
       System.out.println(s.indexOf("Debdip"));
       System.out.println(a+" "+b);
    }
}