import java.util.Arrays;
public class Numbers 
{

	public static void main(String[] args) 
	{
		// Create new array
		int[] numArray = {15,30,14,25,80,70};
		
		// Display the new array
		System.out.println("The array is: " + Arrays.toString(numArray));
		
		//Calling the nextLargest method
		nextLargest(numArray);
	}
	
	public static void nextLargest(int[] numArray)
	{
		// Created a new array with the same element number with the numArray
		int[] sortedArray = new int[numArray.length]; 
		  
        // Copy elements of numArray to sortedArray
        for (int i = 0; i < numArray.length; i++) 
            sortedArray[i] = numArray[i]; 
        
        Arrays.sort(sortedArray);
		
        // initialize number and its next larger number
		int nextLarger = sortedArray[0];
		int number = numArray[0];
		
		// Loop through the numArray 
		for(int i = 0; i < numArray.length; i++)
		{
			// Loop through the sortedArray and do the comparison
			for (int j = 0; j < sortedArray.length; j++)
			{
				if(numArray[i] < sortedArray[j])
				{
					number = numArray[i];
					nextLarger = sortedArray[j];
					break;
				}
				else if(numArray[i] > number)
				{ 
					number = numArray[i];
					nextLarger = Integer.MAX_VALUE;
				}
			}
			// Display the number and its next larger number
			System.out.println(number + " : " + nextLarger);			
		}
	}
}
