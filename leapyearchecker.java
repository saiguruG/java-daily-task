package javaproject;
import java.util.Scanner;

public class leapyearchecker {
	public static void main(String[]args) {
	Scanner obj =new Scanner(System.in);
	
	System.out.println("enter the year: ");
	int year=obj.nextInt();
	if ((year%4==0)&&(year %100!=0)){
		System.out.println(" this leap year :");
	}else {

	
	System.out.println("this is not a leap year:");
	}
	
		
	}
	
  
}
