package task_Java;

import java.util.Arrays;

public class SecondLargest_numberInArray {
	
	
	
	public static void main(String[]args) {
		
		
		int [] number = {0,5, 9, 75, 4, 56, 3,};
		
		Arrays.sort(number);
		
		
		
		System.out.println(Arrays.toString(number));
		
	System.out.println(number[number.length-2]); // let here calculating number in that array
		                                          //  and then finds the total length of array - 2 is done
		                                          // {1, 5, ] .7-2
		
		
	}
	

}
