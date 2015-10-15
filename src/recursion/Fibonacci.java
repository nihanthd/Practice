package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		int num = 10;
		int fib = fibonacci(num);
		System.out.println(fib);
	}

	private static int fibonacci(int num) {
		if(num <= 0){
			return 0;
		}else if(num == 1){
			return 1;
		}else{
			return fibonacci(num-1) + fibonacci(num-2);
		}
	}

}
