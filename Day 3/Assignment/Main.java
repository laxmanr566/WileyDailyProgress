
public class Main {
	public static void main(String args[]) {
		//Circle Object creation
		Circle c=new Circle(10);
		//printing area of circle
		System.out.println("Area of circle :"+c.calculateArea());
		
		//FibnocciSeries object creation
		FibonacciSeries fb=new FibonacciSeries();
		//Calulating fibnociseries
		System.out.println("\nPrinting Fibonacci series: ");
		fb.calculateFibonacci(100);
		
		
		System.out.println("\nChecking date: ");
		//creating Date object
		Date d=new Date(11,02,2000);
		d.checkDate();
		


	}
	}
