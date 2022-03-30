import java.util.Random; 

public class MergeSort {
	// print the array
	static public void printArray(int array[])
		{
			for(int i = 0; i < array.length; i++)
			{
				System.out.println(array[i]);
			}
		}
	
	public static void firstSort(int array[])
		{
			int arrayLength = array.length;
			// if arrayLength is less than 2 then it is assumed to be sorted.
			if(arrayLength < 2)
			{
				return; 
			}
			
			int midPoint = arrayLength / 2; 
			// instantiate two halves of the merge sort 
			int[] leftHalf = new int[midPoint];
			int[] rightHalf = new int[arrayLength - midPoint]; 
			// populating one half of the sort. 
			for(int i = 0; i < midPoint; i++)
			{
				leftHalf[i] = array[i]; 
			}
			// populating the 2nd half of the sort. 
			for(int i = midPoint; i < arrayLength; i++)
			{
				rightHalf[i - midPoint] = array[i]; 
			}
			// recursion
			firstSort(leftHalf);
			firstSort(rightHalf); 
			merge(array, leftHalf, rightHalf); 
			
		}
	
	public static void merge(int[]array, int[] left, int[] right)
	{
		// i = left, j = right, k = array
		int i = 0, j = 0, k = 0;
		int leftLength = left.length; 
		int rightLength = right.length; 
		// comparing the left half "nth" number of the original array to the right half "nth" number.  
		while(i < leftLength && j < rightLength)
		{
			if(left[i] <= right[j])
			{
				array[k] = left[i];
				i++;
			}
			
			else
			{
				array[k] = right[j];
				j++;
			}
			k++;
		}
		
		// pick up the left over numbers of the comparison. 
		while(i < leftLength)
		{
			array[k] = left[i];
			i++;
			k++;
		}
		
		while(j < rightLength)
		{
			array[k] = right[j];
			j++;
			k++; 
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Random rand = new Random(); 
		int[] mergeArray = new int[100];
		
		for(int i = 0; i < mergeArray.length; i ++)
		{
			mergeArray[i] = rand.nextInt(101); 
		}	
		System.out.println("Before sort: ");
		printArray(mergeArray);
		firstSort(mergeArray); 
		System.out.println("After sort: ");
		
		printArray(mergeArray); 
		
	}

}
