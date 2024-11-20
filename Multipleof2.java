package javaproject;
import java.util.Scanner;

public class Multipleof2 {
	public static void main (String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("enter the multiples of 2:" );
		
	int num=obj.nextInt();
	
	if(num%2==0) {
		System.out.println("entered number is multiple of 2: "+num);
	}else {
		System.out.println("entered number is not the multiples of 2 : "+num);
	}

	}
	}
