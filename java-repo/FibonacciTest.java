//fibonacci number

import java.util.Scanner;

public class FibonacciTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++)
		{
			System.out.println(fibonacci(i));	
		}
		
	}

	private static int fibonacci(int n) {
		// TODO Auto-generated method stub
				
		if(n <= 1)
		{
			return n;
		}
		
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
