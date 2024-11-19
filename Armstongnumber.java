package javaproject;
import java.util.Scanner;

public class Armstongnumber {
public static boolean isArmstongnumber (int number) {
	int originalNumber=number;
	int sum=0;
	int numdigits = String.valueOf (number).length();
	while(number>0) {
		int digit = number % 10;
				sum+=Math.pow(digit, numdigits);
				number/=10;
		
	}
	return sum==originalNumber;
}

public static void main(String[]args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("check the entered number is AS: ");
	int num=obj.nextInt();
	if(isArmstongnumber(num)) {
		System.out.println(num+ "  :is an Armstrong number.");
		
	}
	else {
		System.out.println(num+ " : is not an ASrmstongnumbeA");
	}
}
}
	
	

