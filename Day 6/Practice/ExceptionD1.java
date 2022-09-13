import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionD1 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	try {
	int arr[]=new int[] {1,2,3,4,5};
	int n=sc.nextInt();
	System.out.println(arr[n]);
	}
	catch(InputMismatchException | ArrayIndexOutOfBoundsException  e) {
		if(e instanceof InputMismatchException)
			System.out.println("Please insert only Integer");
		if( e instanceof ArrayIndexOutOfBoundsException) {
			System.out.println("entered integer is larger than the array size");
		}
	}
	finally{
		System.out.println("exiting the program");
		
	}
}
}
