package task_Java;

import java.util.Arrays;

public class Second_max_number_Inarray {

	
		
	
	public static void main(String[] args) {

		int[] array1  = { 1, 89, 95, 43, 36, 66 };
		int[] array2  = { 1, 75, 50, 77, 36, 106, 456 };

		
	//	with using sort
	////	Arrays.sort(num1);
	//	Arrays.sort(num2);
		
		

		//System.out.println(Arrays.toString(num1));
	//	System.out.println(Arrays.toString(num2));

	//	System.out.println(num1[num1.length - 1]);
		
		
		//System.out.println(num2[num2.length - 1]);

    // int sum = num1[num1.length-1] + num2[num2.length-1];
		
		
	//Without using sort
		
		for(int i=0; i<array1.length-1; i++) {
			for(int j=i+1; j<array1.length; j++) {
				if(array1[i]>array1[j]) {
					int temp = array1[i];
					array1[i]=array1[j];
					array1[i]= temp;
				}
			}
		}
			
		for(int i=0; i<array2.length-1; i++) {
			for(int j=i+1; j<array2.length; j++) {
				if(array2[i]>array2[i]) {
					int temp = array2[i];
					array2[i]= array2[j];
					array2[i]= temp;
					
					
				}
				
			}
		}
		
		System.out.println(Arrays.toString(array2));
		int sum = array1[array1.length-1]+array2[array2.length-2];
		System.out.println(sum);
			
		}
	}

	
