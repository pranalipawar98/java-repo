import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of element : ");
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		System.out.println(fizzBuzz(num)); 
		
		
	}
	public static List<String> fizzBuzz(final int n)
	{
		final List<String> toReturn = new ArrayList<>();
		for(int i = 1; i<=n ; i++)
		{
			if(i % 15 == 0)
			{
				toReturn.add("FizzBuzz");
			}
			else if(i % 3 == 0)
			{
				toReturn.add("Fizz");
			}
			else if(i % 5 == 0)
			{
				toReturn.add("Buzz");
			}
			else
			{
				toReturn.add(Integer.toString(i));
			}
			
		}
		return toReturn;
	}
}
