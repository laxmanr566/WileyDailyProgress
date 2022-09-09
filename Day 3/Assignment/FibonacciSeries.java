
public class FibonacciSeries {
public void calculateFibonacci(int n) {
	int a=0,b=1;
	int sum=a+b;
	while(sum<n) {
		System.out.print(sum+" ");
		a=b;
		b=sum;
		sum=a+b;
	}
	System.out.println();
}
}
