package cen4802;
public class FibonacciFunction {
	
	public static void main(String[] args) {
		System.out.println("The nth term of the fibonacci sequence  is: " + fibonacciRecursion(10));
	}

	

	public static int fibonacciRecursion(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);}		}

	

	
}
