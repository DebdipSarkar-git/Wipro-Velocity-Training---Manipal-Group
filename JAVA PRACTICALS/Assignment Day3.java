//1. Multiple Objects

public class Main
{
    int x=7;
	public static void main(String[] args) {
		Main a1 = new Main();
		Main a2 = new Main();
		System.out.println(a1.x);
		System.out.println(a2.x);
	}
}

//2. Multiple Objects with for loop

import java.util.*;
public class Main
{
		int fibo(int n){
		    if(n==0)
		      return 0;
		    else if(n==1 || n==2)
		       return 1;
		    else 
		        return fibo(n-1)+fibo(n-2);
		}
       public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the no.of terms:");
           int n = sc.nextInt();
           Main ob = new Main();
           Main ob1 = new Main();
           for(int i=0;i<n;i++){
               System.out.print(ob.fibo(i)+" ");
           }
           System.out.println();
           for(int i=0;i<n;i++){
               System.out.print(ob1.fibo(i)+" ");
           }
       }	
}


//3. Electricity Bill

import java.util.*;
public class Main
{
    public static void main(String args[])   
    {     
        int u;  
        double b = 0;  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter number of units for calculating electricity bill.");  
        u = sc.nextInt();  
        if(u < 100)  
        {  
            b = u * 1.20;  
        }  
        else if(u < 300){  
            b = 100 * 1.20 + (u - 100) * 2;  
        }  
        else if(u > 300)  
        {  
            b = 100 * 1.20 + 200 * 2 + (u - 300) * 3;  
        }  
        System.out.println("The electricity bill for " +u+ " is : " + b);   
    }   
}  

//4. Reverse a number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int r,rev=0;
		while(n>0){
		    r=n%10;
		    rev=(rev*10)+r;
		    n=n/10;
		}
			System.out.println(rev);
	}
}

//5. Single Inheritance

class Animal
{
 
  void eat()
  {
     System.out.println("Animal is eating...");
    
   }  
}
class Dog extends Animal{  
    void bark(){
        System.out.println("Dog is barking...");
         
    }  
}  
class Main{  
    public static void main(String args[]){  
       Dog d=new Dog();  
       d.bark();  
       d.eat();  
   }
}

//6. Multilevel Inheritance

class Animal
{
 
  void eat()
  {
     System.out.println("Animal is eating...");
    
   }  
}
class Dog extends Animal{  
    void bark(){
        System.out.println("Dog is barking...");
         
    }  
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("BabyDog is weeping");
    }
}

class Main{  
    public static void main(String args[]){  
       BabyDog b = new BabyDog();
       b.weep();
       b.bark();
       b.eat();
    }
}

//7. Hierarchical Inheritance(Given by Shaifali Maam)

class GrandFather
{
 public void printGrandFather()
 {
   System.out.println("GrandFather's class");
 }
}
 
class Father extends GrandFather
{
 public void printFather()
 {
   System.out.println("Father class has inherited GrandFather class");
 }
}
 
class Son extends Father
{
 public Son()
 {
   System.out.println("Inside the Son Class");
 }
 
 public void printSon()
 {
   System.out.println("Son class has inherited Father class");
 }
}
 
class Daughter extends Father
{
 public Daughter()
 {
   System.out.println("Inside the Daughter Class");
 }
 
 public void printDaughter()
 {
   System.out.println("Son class has inherited Father class");
 }
}
 
public class Main
{
 public static void main(String[]args)
 {
   Son obj = new Son();
   obj.printSon();  // Accessing Son class method
   obj.printFather();  // Accessing Father class method
   obj.printGrandFather();  // Accessing GrandFather class method
 
   Daughter obj2 = new Daughter();
   obj2.printDaughter();  // Accessing Daughter class method
   obj2.printFather();    // Accessing Father class method
   obj2.printGrandFather();   // Accessing GrandFather class method
 
 
 }
}

//8. Hierarchical Inheritance

class Animal
{
 
  void eat()
  {
     System.out.println("Animal is eating...");
    
   }  
}
class Dog extends Animal{  
    void bark(){
        System.out.println("Dog is barking...");
         
    }  
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("BabyDog is weeping");
    }
}
class GoldenRetriever extends Dog{
    void smell(){
        System.out.println("GoldenRetriever has a strong smelling power");
    }
}
class Main{  
    public static void main(String args[]){  
       BabyDog b = new BabyDog();
       b.weep();
       b.bark();
       b.eat();
       
       GoldenRetriever g = new GoldenRetriever();
       g.smell();
       g.bark();
       g.eat();
   }
}

//9. Polymorphism (Method Overloading)

class Area
{
    void areaSquare(int x)
    {
        System.out.println("the area of the square is "+(x*x)+" sq units");
    }
    void areaRectangle(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void areaCircle(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
class Main
{
     public static void main(String args[]) 
	{
	   Area ob = new Area();
	   ob.areaSquare(5);
	   ob.areaRectangle(11,12);
	   ob.areaCircle(2.5);
    }
}