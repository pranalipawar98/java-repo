import java.util.Arrays;

public class MergeListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 10, 5, 15 }; 
        int arr2[] = { 20, 3, 2, 12 }; 
        int len1 = arr1.length; 
        int len2 = arr2.length; 
       
        // Final merge list 
        int res[] = new int[len1 + len2]; 
        sortedMerge(arr1, arr2, res, len1, len2);
        
        System.out.print( "Sorted merged list :"); 
        for (int i = 0; i < len1 + len2 ; i++) 
            System.out.print(" " + res[i]);    
	}

	public static void sortedMerge(int[] arr1, int[] arr2, int[] res, int len1, int len2) {
		// TODO Auto-generated method stub
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i = 0, j = 0, k = 0;
		
		while(i < len1 && j < len2)
		{
			if(arr1[i] < arr2[j])
			{
				res[k] = arr1[i];
				i+=1;
				k+=1;
			}
			else
			{
				res[k] = arr2[j];
				j+=1;
				k+=1;
			}
			
		}
		System.out.println("Sorted ist 1: ");
		
		 while (i < len1) {  // Merging remaining 
             // elements of a[] (if any) 
		res[k] = arr1[i]; 
		i += 1; 
		k += 1; 
		}     
		System.out.println("Sorted ist 2: ");
		while (j < len2) {   // Merging remaining 
		             // elements of b[] (if any) 
		res[k] = arr2[j]; 
		j += 1; 
		k += 1; 
		} 
		System.out.println("Sorted ist 3: ");
	}

}
