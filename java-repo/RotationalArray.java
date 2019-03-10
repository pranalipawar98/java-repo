import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RotationalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = {1,2,3,4,5};
		int d = 2;
		
		
	//	printArray(numArr, d);
		System.out.println("-----------Rotate Right-----------");
		rotateRight(numArr, d);
	}

	public static void printArray(int[] numArr, int d) {
		// TODO Auto-generated method stub
		/*int[] newArr = new int[numArr.length-1];
		int temp = numArr[0];
		
		for(int i=1; i<=2; i++)
		{
			for(int j = 0; j < numArr.length-1; j++)
			{
				numArr[j] = numArr[j+1];
			}		
		
			
		}
		for(int k =0; k< numArr.length; k++)
		{
			System.out.println(numArr[k]);
		}*/
		
		/*ArrayList<Integer> al = new ArrayList<>();
		for(int n : numArr)
		{
			al.add(n);
		}
		Collections.rotate(al, ++d);
		
		System.out.println(al);*/
		 int temp;
         
	        for (int i = 0; i < d; i++)
	        {
	            temp = numArr[0];
	             
	            for (int j = 0; j < numArr.length-1; j++) 
	            {
	                numArr[j] = numArr[j+1];
	            }
	             
	            numArr[numArr.length - 1] = temp;
	        }
	        System.out.println(Arrays.toString(numArr));
	}
	public static void rotateRight(int[] arr, int d) {
		int temp;
		for(int i = 0; i <d ; i++)
		{
			temp = arr[arr.length-1];
			for(int k =arr.length-1; k > 0 ; k--)
			{
				arr[k]=arr[k-1];
				
			}
			arr[0] = temp;
			
		}
		 System.out.println(Arrays.toString(arr));
			
		
	}

}
