package javaproject;

public class EvenorAdd {
	public static void printEvenorOdd(int[]numbers) {
		int[] number = {1,2,3,4,5,6,7,8,9,10};
		//loop through each number in the array
		for (int num: numbers) {System.out.println(" its even: ");
			if(num% 2==0) {
				System.out.println(num);
				
			}
			 
		}System.out.println("its an odd: ");
		for (int num:numbers) {
			if(num % 2 !=0) {
				System.out.println(num);
			}
		}
		
	}
	public static void main (String[]args ) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		printEvenorOdd(numbers);
		
	}
}
				
