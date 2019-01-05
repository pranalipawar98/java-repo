
public class ReverseStringwithSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			reverseString("Hello this is me");
	}
	
	public static void reverseString(String inputString)
	{
		char[] inputStringArray = inputString.toCharArray();
		char[] resultArray = new char[inputStringArray.length];
		
		for(int i = 0; i < inputStringArray.length; i++)
		{
			if(inputStringArray[i] == ' ')
			{
				resultArray[i] = ' ';
			}			
		}
		
		int j = resultArray.length-1;
		for(int i =0 ; i < inputStringArray.length; i++)
		{
			if(inputStringArray[i] != ' ')
			{
				if(resultArray[j] == ' ')
				{
					j--;
				}
				resultArray[j] = inputStringArray[i];
				j--;
			}
		}
		
		 System.out.println(inputString+" ---> "+String.valueOf(resultArray));
	}
}
