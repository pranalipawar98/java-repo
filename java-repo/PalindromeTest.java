import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string : ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		if(isPalindrome(inputString) == true)
		{
			System.out.println("input String is palindrome");
		}
		else
		{
			System.out.println("input String is not palindrome");
		}
	}
	public static boolean isPalindrome(String inputString)
	{
		String cleanString = inputString.replace("//s+", "").toLowerCase();
		char[] inputStringArray = cleanString.toCharArray();
		int forward = 0;
		int backward = inputStringArray.length-1;
		
		while(forward <= backward)
		{
			if(inputStringArray[forward] != inputStringArray[backward])
			{
				return false;
			}
			forward++;
			backward--;
		}
		
		return true;
	}
}
