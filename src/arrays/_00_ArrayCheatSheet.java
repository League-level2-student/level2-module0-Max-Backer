package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		//String[] str = new String[5];
		String[] str = {"red", "blue", "yellow", "green"};
		
		
		//2. print the third element in the array
		System.out.println(str[2]);
		
		//3. set the third element to a different value
		str[2] = "a different color";
		//4. print the third element again
		System.out.println(str[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		//6. make an array of 50 integers
		int[] array = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(0, 100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestNum = array[0];
		
		for(int i = 0; i < str.length; i++) {
			if(array[i] < smallestNum) {
				smallestNum = array[i];
			}
		}
		System.out.println(smallestNum);
		//9 print the entire array to see if step 8 was correct
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		//10. print the largest number in the array.
			int largestNum = array[0];
			
			for(int i = 0; i < array.length; i++) {
				if(array[i] > largestNum) {
					largestNum = array[i];
				}
			}
			System.out.println(largestNum);
	}
}
